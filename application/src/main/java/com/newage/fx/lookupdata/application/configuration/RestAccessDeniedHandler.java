package com.newage.fx.lookupdata.application.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.newage.fx.lookupdata.application.ResponseDTO;
import com.newage.fx.lookupdata.application.dto.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {

        final String errorMessage = HttpStatus.UNAUTHORIZED.getReasonPhrase();
        final ResponseError error = new ResponseError(HttpStatus.UNAUTHORIZED.getReasonPhrase(), List.of(errorMessage));
        ResponseDTO responseError = new ResponseDTO(HttpStatus.UNAUTHORIZED.value(), Boolean.FALSE, null, error);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        OutputStream out = response.getOutputStream();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(out, responseError);
        out.flush();
    }
}