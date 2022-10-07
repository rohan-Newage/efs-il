package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EfsCallListResponseDTO {
    private String callid;
    private String createddate;
    private String type;
    private String subtype;
    private String salesman_code;
    private String salesman_name;
    private String custid;
    private String cust_name;
    private String ispotentialclient;
    private List<EfsCallListFollowupResponseDTO> followups;
}
