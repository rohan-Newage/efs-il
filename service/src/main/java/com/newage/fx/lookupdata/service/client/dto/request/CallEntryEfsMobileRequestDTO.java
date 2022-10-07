package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CallEntryEfsMobileRequestDTO {


    private String cusCode;
    private String callType;
    private String subType;
    private String callMode;
    private String desc;
    private String followDate;
    private String followAction;
    private String createdDate;



}
