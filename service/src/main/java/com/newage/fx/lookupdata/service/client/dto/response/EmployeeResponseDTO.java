package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.EmployeeStatus;
import com.newage.fx.lookupdata.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
public class EmployeeResponseDTO {

    private Long id;
    private String code;
    private String firstName;
    private String middleName;
    private String lastName;
    private String aliasName;
    private String email;
    private String mobileNo;
    private Date dob;
    private NationalityDTO nationality;
    private EmployeeStatus status;
    private Gender gender;
    private String perAddress1;
    private String perAddress2;
    private String perAddress3;
    private String phoneNo;
    private String conAddress1;
    private String conAddress2;
    private String conAddress3;
    private String personalEmail;
    private String image;
    private String imageUrl;
    private EmployeeProfessionalDetailResponseDTO professionalDetail;
    private List<EmployeeAccessDetailResponseDTO> accessDetails;



    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class NationalityDTO {
        private Long id;
        private String code;
        private String name;

        public NationalityDTO() {
        }
    }
}
