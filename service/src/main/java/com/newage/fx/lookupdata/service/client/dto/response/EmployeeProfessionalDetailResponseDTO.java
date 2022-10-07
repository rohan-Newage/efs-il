package com.newage.fx.lookupdata.service.client.dto.response;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@EqualsAndHashCode
public class EmployeeProfessionalDetailResponseDTO {

    private Long id;
    private Date doj;
    private boolean isSalesman;
    private EmploymentStatusDTO employmentStatusMaster;
    private DepartmentMasterDTO departmentMaster;
    private ReportingToDTO reportingTo;
    private DesignationDTO designationMaster;
    private BranchDTO branchMaster;
    private EmployeeMasterDTO employeeMaster;



    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class EmploymentStatusDTO {
        private Long id;
        private String code;
        private String name;

        public EmploymentStatusDTO() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class DepartmentMasterDTO {
        private Long id;
        private String code;
        private String name;

        public DepartmentMasterDTO() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class ReportingToDTO {
        private Long id;
        private String code;
        private String name;

        public ReportingToDTO() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class DesignationDTO {
        private Long id;
        private String code;
        private String name;

        public DesignationDTO() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class BranchDTO {
        private Long id;
        private String code;

        public BranchDTO() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class EmployeeMasterDTO {
        private Long id;
        private String code;

        public EmployeeMasterDTO() {
        }
    }
}