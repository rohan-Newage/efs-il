package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.EmployeeMappingType;
import com.newage.fx.lookupdata.domain.enums.OrganisationAcess;
import com.newage.fx.lookupdata.domain.enums.UserStatus;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class UserProfileResponseDTO {
    private Long id;
    private String userName;
    private UserStatus status;
    private List<RoleResponseDTO> roleResponseDTOList;
    private OrganisationAcess organisationAcess;
    private Long primaryCompanyId;
    private String primaryCompanyName;
    private Long primaryLoginBranchId;
    private String primaryLoginBranchName;
    private Long commonEmployeeId;
    private String commonEmployeeName;
    private EmployeeMappingType employeeMappingType;
    private List<UserCompanyResponseDTO> userCompanyResponseDTOList;
    private List<UserDeviceTokenResponseDTO> userDeviceTokens;
    private Map<GroupCompanyDto, List<CompanyDto>> groupCompanyMap;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    //private Long countryId;
    //private String countryName;
     private CurrencyDTO currency;



    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GroupCompanyDto {
        private Long id;
        private String name;

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id.intValue();
            return result;
        }

        //Compare only account numbers
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            GroupCompanyDto other = (GroupCompanyDto) obj;
            if (id != other.id)
                return false;
            return true;
        }
    }
    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CompanyDto {
        private Long id;
        private String name;
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CurrencyDTO{
        private Long id;
        private String code;
        private String name;

    }
}
