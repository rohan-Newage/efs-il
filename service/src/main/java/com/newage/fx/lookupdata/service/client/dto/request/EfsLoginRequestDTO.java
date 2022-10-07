package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EfsLoginRequestDTO {
    String username;
    String password;
    String saasId;
}
