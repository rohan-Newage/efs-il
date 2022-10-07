package com.newage.fx.lookupdata.service.client.dto.request;

import com.newage.fx.lookupdata.domain.enums.JointCallType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CallEntryJointCallInfoRequestDTO {
    private Long id;
    private String employeeId;
    private String description;
    private JointCallType jointCallType;
}
