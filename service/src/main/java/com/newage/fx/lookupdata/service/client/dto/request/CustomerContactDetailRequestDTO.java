package com.newage.fx.lookupdata.service.client.dto.request;

import com.newage.fx.lookupdata.domain.enums.Salutation;
import com.newage.fx.lookupdata.domain.enums.YesNo;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class CustomerContactDetailRequestDTO {
    private Long id;
    @NotNull(message = "Accepted Values ( Mr, Ms, Mrs)")
    private Salutation salutation;
    @NotNull
    @NotBlank
    private String firstName;
    @NotNull
    @NotBlank
    private String lastName;
    private Long designationId;
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
