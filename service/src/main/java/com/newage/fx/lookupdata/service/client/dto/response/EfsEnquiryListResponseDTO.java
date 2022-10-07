package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EfsEnquiryListResponseDTO {

    private String enquiryno;
    private String  createddate;
    private String  customercode;
    private String  enquirydate;
    private String  quote_by;
    private String quotation_no;
    private List<EfsEnquiryListDetailsResponseDTO> details;
}
