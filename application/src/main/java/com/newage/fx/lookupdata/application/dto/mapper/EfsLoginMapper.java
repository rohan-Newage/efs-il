package com.newage.fx.lookupdata.application.dto.mapper;

import com.newage.fx.lookupdata.domain.enums.EmployeeMappingType;
import com.newage.fx.lookupdata.domain.enums.OrganisationAcess;
import com.newage.fx.lookupdata.domain.enums.UserStatus;
import com.newage.fx.lookupdata.service.client.MasterDataServiceClient;
import com.newage.fx.lookupdata.service.client.dto.response.EfsLoginResponseDTO;
import com.newage.fx.lookupdata.service.client.dto.response.UserProfileResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class EfsLoginMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MasterDataServiceClient masterDataServiceClient;

    public UserProfileResponseDTO convertEfsTONxtResponse(EfsLoginResponseDTO efsLoginResponseDTO){

        UserProfileResponseDTO userProfileResponseDTO=modelMapper.map(efsLoginResponseDTO,UserProfileResponseDTO.class);
        if (efsLoginResponseDTO.getLogindetail()!=null && efsLoginResponseDTO.getLogindetail().getUserdetail()!=null && efsLoginResponseDTO.getLogindetail().getUserdetail().getName()!=null) {
            userProfileResponseDTO.setUserName(efsLoginResponseDTO.getLogindetail().getUserdetail().getName());
            userProfileResponseDTO.setCreatedBy(efsLoginResponseDTO.getLogindetail().getUserdetail().getName());
        }
        userProfileResponseDTO.setStatus(UserStatus.Active);
        userProfileResponseDTO.setRoleResponseDTOList(new ArrayList<>());
        userProfileResponseDTO.setOrganisationAcess(OrganisationAcess.GLOBAL);
        userProfileResponseDTO.setCommonEmployeeId(null);
        userProfileResponseDTO.setCommonEmployeeName("");
        userProfileResponseDTO.setPrimaryCompanyId(null);
        userProfileResponseDTO.setPrimaryCompanyName("");
        userProfileResponseDTO.setPrimaryLoginBranchId(null);
        userProfileResponseDTO.setPrimaryLoginBranchName("");
        userProfileResponseDTO.setEmployeeMappingType(EmployeeMappingType.ALL);
        userProfileResponseDTO.setUserCompanyResponseDTOList(new ArrayList<>());
        userProfileResponseDTO.setUserDeviceTokens(new ArrayList<>());
        userProfileResponseDTO.setGroupCompanyMap(null);
       // userProfileResponseDTO.setCreatedBy(efsLoginResponseDTO.getLogindetail().getUserdetail().getName());
        userProfileResponseDTO.setCreatedDate(null);
        userProfileResponseDTO.setLastModifiedBy("");
        userProfileResponseDTO.setLastModifiedDate(null);
        userProfileResponseDTO.setCurrency(null);

        return userProfileResponseDTO;

    }



}
