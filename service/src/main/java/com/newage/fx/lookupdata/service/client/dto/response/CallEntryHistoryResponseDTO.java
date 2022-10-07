package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.CallMode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CallEntryHistoryResponseDTO {
    private Long id;
    private String callNo;
    private Date date;
    private Long callOwnerId;
    private String callOwnerName;
    private CallMode mode;
}
