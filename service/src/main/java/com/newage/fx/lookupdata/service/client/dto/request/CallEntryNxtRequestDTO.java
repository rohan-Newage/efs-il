package com.newage.fx.lookupdata.service.client.dto.request;

import com.newage.fx.lookupdata.domain.enums.CallEntryStatus;
import com.newage.fx.lookupdata.domain.enums.CallMode;
import com.newage.fx.lookupdata.domain.enums.YesNo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Data
public class CallEntryNxtRequestDTO {

    private String id;
    @NotNull
    private String customerId;
    @NotNull
    private Date date;
    @NotNull(message = "Accepted Values (Phone,Visit,Email,Remote)")
    private CallMode mode;
    private String callType;
    private String subType;
    @NotNull
    private String note;
    @NotNull(message = "Accepted Values (Yes,No)")
    private YesNo isFollowUpRequired = YesNo.No;
    @NotNull(message = "Accepted Values (Yes,No)")
    private YesNo isFollowUpCompleted = YesNo.No;
    private Date followupDate;
    private String followAction;
   // private Long followUpActionId;
    private String locationName;
    private Date scheduleFollowUpDate;
    private CallEntryStatus status;
    @Valid
    @Delegate
    private List<CustomerContactDetailRequestDTO> customerContactDetailRequestDTOList;
    @Valid
    private List<CallEntryProductDetailRequestDTO> productDetailRequestDTOList;
    private List<CallEntryQuestionnaireRequestDTO> callEntryQuestionnaireRequestDTOList;
    private List<CallEntryCompetitorRequestDTO> competitorRequestDTOList;
    private List<CallEntryAttachmentsRequestDTO> attachmentsRequestDTOList;
    private List<CallEntryJointCallInfoRequestDTO> jointCallInfoRequestDTOList;

}
