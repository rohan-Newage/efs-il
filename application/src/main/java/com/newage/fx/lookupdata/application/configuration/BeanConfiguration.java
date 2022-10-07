package com.newage.fx.lookupdata.application.configuration;

import com.newage.fx.lookupdata.service.exception.ServiceErrors;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Configuration
@Log4j2
public class BeanConfiguration {

    @Value("${springdoc.swagger-ui.docUrl}")
    private String springDocUrl;

    @Bean
    public MessageSource messageSource() {

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:messages/messages");
        messageSource.setUseCodeAsDefaultMessage(true);
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.displayName());
        messageSource.setCacheSeconds(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));
        messageSource.setFallbackToSystemLocale(false);
        return messageSource;
    }

    @Bean
    public ModelMapper modelMapper() {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        return modelMapper;
    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().addServersItem(new Server().url(springDocUrl))
                .components(new Components().addSecuritySchemes("basicScheme",
                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")));


    }

    @PostConstruct
    public void errorCodesLoading() {

        log.info("Initializing Validation properties!");

        ServiceErrors.validateDuplicates();
        Set<String> messageKeys = ServiceErrors.getMessageKeys();
        Resource resource = new ClassPathResource("messages/messages.properties");
        Set<String> missingKeys;

        try {
            Properties loadedProperties = PropertiesLoaderUtils.loadProperties(resource);
            missingKeys = messageKeys.stream().filter(key -> !loadedProperties.containsKey(key)).collect(Collectors.toSet());
        } catch (IOException e) {
            log.error("Error Parsing Message Resource", e);
            throw new RuntimeException("Error Parsing Message Resource");
        }

        if(!missingKeys.isEmpty()){
            log.error("Missing Keys For Default Locale : {}", missingKeys);
            throw new RuntimeException("Missing Keys For Default Locale");
        }

        log.info("Completed initializing Validation properties!");
    }


}
