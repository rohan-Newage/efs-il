package com.newage.fx.lookupdata.application.dto.mapper;

import com.newage.fx.lookupdata.domain.enums.CallMode;
import com.newage.fx.lookupdata.service.client.EfsMobileServiceClient;
import com.newage.fx.lookupdata.service.client.MasterDataServiceClient;
import com.newage.fx.lookupdata.service.client.dto.response.CallEntryResponseDTO;
import com.newage.fx.lookupdata.service.client.dto.response.EfsCallListFollowupResponseDTO;
import com.newage.fx.lookupdata.service.client.dto.response.EfsCallListResponseDTO;
import com.newage.fx.lookupdata.service.client.dto.response.EfsCallResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CallEntryNxtToEfsMapper  {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    MasterDataServiceClient masterDataServiceClient;

    @Autowired
    EfsMobileServiceClient efsMobileServiceClient;




    public List<CallEntryResponseDTO> convertEfsToNXTResponse(EfsCallResponseDTO efsCallResponseDTO){
            List<CallEntryResponseDTO> callEntryResponseDTOS=new ArrayList<>();
            for (EfsCallListResponseDTO callListResponseDTO:efsCallResponseDTO.getCalllist()){
                CallEntryResponseDTO responseDTO=new CallEntryResponseDTO();
                responseDTO.setId(callListResponseDTO.getCallid());
                responseDTO.setCallNo(callListResponseDTO.getCallid());
                responseDTO.setDate(callListResponseDTO.getCreateddate());
                responseDTO.setCallType(callListResponseDTO.getType());
                responseDTO.setSubType(callListResponseDTO.getSubtype());
                responseDTO.setCustomerId(callListResponseDTO.getCustid());
                responseDTO.setCustomerName(callListResponseDTO.getCust_name());
                responseDTO.setCallOwnerId(callListResponseDTO.getSalesman_code());
                responseDTO.setCallOwnerName(callListResponseDTO.getSalesman_name());
                for (EfsCallListFollowupResponseDTO followupResponseDTO: callListResponseDTO.getFollowups()){
                    responseDTO.setLastModifiedDate(followupResponseDTO.getUpdateddate());
                    responseDTO.setFollowupDate(followupResponseDTO.getFollowupdate());
                    responseDTO.setMode(CallMode.valueOf( followupResponseDTO.getMode()));
                    responseDTO.setNote(followupResponseDTO.getDesc());
                    responseDTO.setFollowAction(followupResponseDTO.getAction());
                }

                callEntryResponseDTOS.add(responseDTO);






            }

            return callEntryResponseDTOS;

    }

}
