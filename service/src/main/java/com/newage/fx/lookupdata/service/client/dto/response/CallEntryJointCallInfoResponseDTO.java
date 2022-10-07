package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.JointCallStatus;
import com.newage.fx.lookupdata.domain.enums.JointCallType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallEntryJointCallInfoResponseDTO {
    private Long id;
    private Long employeeId;
    private String employeeName;
    private String description;
    private JointCallType jointCallType;
    private String callReference;
    private JointCallStatus jointCallStatus;
}
