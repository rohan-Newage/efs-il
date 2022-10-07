package com.newage.fx.lookupdata.service.client.dto.response;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class EmployeeAccessDetailResponseDTO {
    
    private EmployeeAccessDTO accessEmployee;
    private EmployeeMasterDTO employeeMaster;

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class EmployeeAccessDTO {
        private Long id;
        private String code;
        private String aliasName;

        public EmployeeAccessDTO() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class EmployeeMasterDTO {
        private Long id;
        private String code;
        private String aliasName;

        public EmployeeMasterDTO() {
        }
    }
}