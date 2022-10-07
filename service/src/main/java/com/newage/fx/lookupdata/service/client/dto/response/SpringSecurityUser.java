package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpringSecurityUser {

    private String id_token;
    private String access_token;
    private String refresh_token;
    private String tokenType;

}
