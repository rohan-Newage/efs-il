package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.CallEntryStatus;
import com.newage.fx.lookupdata.domain.enums.CallMode;
import com.newage.fx.lookupdata.domain.enums.YesNo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class CallEntryResponseDTO {
    private String id;
    private String callNo;
    private String customerId;
    private String customerName;
    String colourCode;
    private String gradeName;
    private String date;
    private String callOwnerId;
    private String callOwnerName;
    private CallMode mode;
    private String callType;
    private String subType;
    private String note;
    private YesNo isFollowUpRequired;
    private YesNo isFollowUpCompleted;
    private String followupDate;
    private String followAction;
    //private String followUpActionId;
    //private String followupActionName;
    private Long branchId;
    private String cancelReason;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private String locationName;
    private Date scheduleFollowUpDate;
    private CallEntryStatus status;
    private String grade;
    private Boolean isInstantCustomer = false;
    private List<CallEntryCustomerResponseDTO> customerAddressRespone;
    private List<CallEntryCustomerResponseDTO> customerContactRespone;
    private List<CustomerContactDetailResponseDTO> customerContactDetailResponseDTO;
    private List<CallEntryProductDetailResponseDTO> productDetailResponseDTO;
    private List<CallEntryQuestionnaireResponseDTO> questionnaireDTO;
    private List<CallEntryCompetitorResponseDTO> competitorResponseDTO;
    private List<CallEntryAttachmentsResponsetDTO> attachmentsResponsetDTO;
    private List<CallEntryJointCallInfoResponseDTO> jointCallInfoResponseDTO;
//    private List<CustomerAddressDetailResponseDTO> customerAddressDetailResponseDTOList;


    /*@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public  static class CustomerAddressDetails{

        private String mobileNumbers;
        private String email;
        private boolean primary;
    }*/


}
