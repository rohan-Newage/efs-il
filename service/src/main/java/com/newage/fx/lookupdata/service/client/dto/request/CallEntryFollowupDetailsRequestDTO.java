package com.newage.fx.lookupdata.service.client.dto.request;

import com.newage.fx.lookupdata.domain.enums.CallMode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
public class CallEntryFollowupDetailsRequestDTO {
	private Long id;
	@NotNull(message = "Accepted Values (Phone,Visit,Email)")
    private CallMode mode;
	private String managerComment;
	private Date followupDate;
	private Long followUpById;
	private Long followUpActionId;
/*
	private Long followUpStatusId;
*/
	private Long elevationLevelId;
}
