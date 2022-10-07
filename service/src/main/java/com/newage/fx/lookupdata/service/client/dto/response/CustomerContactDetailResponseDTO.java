package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.Salutation;
import com.newage.fx.lookupdata.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class CustomerContactDetailResponseDTO {
    private Long id;
    @NotNull(message = "Accepted Values ( Mr, Ms, Mrs)")
    private Salutation salutation;
    private String firstName;
    private String lastName;
    private Long designationId;
    private String designationName;
    private String preOfficeNo;
    private String officePhoneNo;
    private List<MobileNumberDTO> mobileNumbers;
    private List<String> email;
    private String department;
    @NotNull(message = "Accepted Values (Yes, No)")
    private YesNo primaryContact;
    @NotNull(message = "Accepted Values (Yes, No)")
    private YesNo decisionMaker;
    private Long customerContactId;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MobileNumberDTO {
        private String preMobileNo;
        private String mobileNo;
    }

}