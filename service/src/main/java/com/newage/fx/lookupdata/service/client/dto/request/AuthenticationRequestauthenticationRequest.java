package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AuthenticationRequestauthenticationRequest {

    String poolId;
    String clientId;
    String saasId;
    String userName;
    String password;

}