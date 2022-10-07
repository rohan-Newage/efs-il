package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EfsLoginDetailResponseDTO {

    private String userid;
    private String usertoken;
    private String ismanager;
    private String empcode;
    private EfsUserDetailResponseDTO userdetail;

}
