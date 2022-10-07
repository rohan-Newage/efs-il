package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.CallMode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CallEntryFollowupDetailsResponseDTO {
    private Long id;
    private CallMode mode;
    private String managerComment;
    private Date followupDate;
    private Long followUpActionId;
    private String followupActionName;
    private Long followUpById;
    private String followUpByName;
   /* private Long followUpStatusId;
    private Long followUpStatusName;*/
    private Long elevationLevelId;
    private String elevationLevelName;
}
