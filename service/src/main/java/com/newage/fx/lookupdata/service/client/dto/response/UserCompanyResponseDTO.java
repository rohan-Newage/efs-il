package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCompanyResponseDTO {
    private Long id;
    private Long groupCompanyId;
    private String groupCompanyName;
    private Long companyId;
    private String companyName;
    private Long employeeId;
    private String employeeName;
    private List<BranchMasterDto> companyBranchList=new ArrayList<>();

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BranchMasterDto {
        private Long id;
        private String name;
        private CountryMasterDTO countryMasterDTO;
         private CurrencyMasterDTO currencyMasterDTO;
    }
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CountryMasterDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CurrencyMasterDTO {
        private Long id;
        private String code;
        private String name;
    }
}
