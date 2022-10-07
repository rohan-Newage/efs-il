package com.newage.fx.lookupdata.service.client.dto.response;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EfsCustomerInfoResponseDTO {

    private String custid;
    private String name;
    private String territory;
    private String city;
    private String country;
    private String phoneno;
    private String mobileno;
    private String emailid;
    private String contactperson;
    private String potentialforwarehousing;
    private String potentialforclearance;
    private String salesman;
    private List<EfsCustomerProfileListResponseDTO> profile;
    private List<EfsCustomerCallHistoryListResponseDTO> callhistory;
}
