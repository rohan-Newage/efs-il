package com.newage.fx.lookupdata.application.configuration;

import com.newage.fx.lookupdata.domain.repository.MasterEventListenerIntegrator;
import org.hibernate.jpa.boot.spi.IntegratorProvider;
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
public class HibernateEventConfiguration implements HibernatePropertiesCustomizer {
    @Override
    public void customize(Map<String, Object> hibernateProperties) {
        hibernateProperties.put("hibernate.integrator_provider",
                (IntegratorProvider) () -> Collections.singletonList(MasterEventListenerIntegrator.INSTANCE));

    }
}
