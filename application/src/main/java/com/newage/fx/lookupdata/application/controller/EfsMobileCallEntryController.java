package com.newage.fx.lookupdata.application.controller;

import com.newage.fx.lookupdata.application.ResponseDTO;
import com.newage.fx.lookupdata.application.dto.mapper.CallEntryNxtToEfsMapper;
import com.newage.fx.lookupdata.application.dto.mapper.EfsLoginMapper;
import com.newage.fx.lookupdata.domain.enums.CallEntryStatus;
import com.newage.fx.lookupdata.domain.enums.YesNo;
import com.newage.fx.lookupdata.service.ServiceLayer;
import com.newage.fx.lookupdata.service.client.MasterDataServiceClient;
import com.newage.fx.lookupdata.service.client.dto.request.*;
import com.newage.fx.lookupdata.service.client.dto.response.*;
import com.newage.fx.lookupdata.service.util.CommonUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/api/v1/efs-il/efs-mobile-callEntries")
public class EfsMobileCallEntryController {

    @Autowired
    private CallEntryNxtToEfsMapper nxtToEfsMapper;

    @Autowired
    private EfsLoginMapper efsLoginMapper;

    @Autowired
    private MasterDataServiceClient masterDataServiceClient;
    private final ServiceLayer serviceLayer;

    @Autowired
     private CommonUtil commonUtil;
    DateFormat format = new SimpleDateFormat("dd-MMM-yy");


    @Autowired
    public EfsMobileCallEntryController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @PostMapping(value = "/create-call ", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> createCallEntry(@RequestBody CallEntryNxtRequestDTO callEntryNxtRequestDTO,
                                                       @RequestParam String username, @RequestParam(required = false) String user_token) {

        String jointcalls = "";
        for (CallEntryJointCallInfoRequestDTO callEntryJointCallInfoRequestDTO : callEntryNxtRequestDTO.getJointCallInfoRequestDTOList()) {
            jointcalls = jointcalls + callEntryJointCallInfoRequestDTO.getEmployeeId() + ":" + callEntryJointCallInfoRequestDTO.getDescription() + ",";

        }
        jointcalls = jointcalls.substring(0, jointcalls.lastIndexOf(','));
        log.info("Called: /api/v1/sales/efs-mobile-callEntries method createCallEntry ");
        CallEntryResponseDTO result = serviceLayer.newCall(username, user_token, callEntryNxtRequestDTO.getCustomerId(), callEntryNxtRequestDTO.getCallType(), callEntryNxtRequestDTO.getSubType(), callEntryNxtRequestDTO.getMode().toString(), callEntryNxtRequestDTO.getNote(), format.format(callEntryNxtRequestDTO.getFollowupDate()).toUpperCase(), callEntryNxtRequestDTO.getFollowAction(), format.format(callEntryNxtRequestDTO.getDate()).toUpperCase(), jointcalls);
        result.setCallNo("");
        result.setCustomerId(callEntryNxtRequestDTO.getCustomerId());
        result.setCustomerName("");
        result.setCallOwnerId(null);
        result.setCallOwnerName(username);
        result.setMode(callEntryNxtRequestDTO.getMode());
        result.setNote(callEntryNxtRequestDTO.getNote());
        result.setFollowupDate(format.format(callEntryNxtRequestDTO.getFollowupDate()));
        result.setIsFollowUpRequired(YesNo.Yes);
        result.setIsFollowUpCompleted(YesNo.No);
        result.setDate(format.format(callEntryNxtRequestDTO.getDate()));
        result.setFollowAction(callEntryNxtRequestDTO.getFollowAction());
        result.setScheduleFollowUpDate(null);
        result.setStatus(CallEntryStatus.Scheduled);
        result.setIsInstantCustomer(null);
        result.setCustomerAddressRespone(new ArrayList<>());
        result.setCustomerContactRespone(new ArrayList<>());
        result.setCustomerContactDetailResponseDTO(new ArrayList<>());
        result.setProductDetailResponseDTO(new ArrayList<>());
        result.setQuestionnaireDTO(new ArrayList<>());
        result.setCompetitorResponseDTO(new ArrayList<>());
        result.setAttachmentsResponsetDTO(new ArrayList<>());

        List<CallEntryJointCallInfoResponseDTO> callEntryJointCallInfoResponseDTO = new ArrayList<>();

        for (CallEntryJointCallInfoRequestDTO callEntryJointCallInfoRequestDTO : callEntryNxtRequestDTO.getJointCallInfoRequestDTOList()) {
            CallEntryJointCallInfoResponseDTO jointCallInfoResponseDTO = new CallEntryJointCallInfoResponseDTO();
            jointCallInfoResponseDTO.setDescription(callEntryJointCallInfoRequestDTO.getDescription());
            callEntryJointCallInfoResponseDTO.add(jointCallInfoResponseDTO);

        }
        result.setJointCallInfoResponseDTO(callEntryJointCallInfoResponseDTO);


        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);


    }


    @GetMapping(value = "/get-call-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getCallList(@RequestParam String username, @RequestParam(required = false) String user_token,
                                                   @RequestParam(required = false) String Salesmancode) {
       EfsCallResponseDTO result = serviceLayer.getCallList(username, user_token, Salesmancode);

        List<CallEntryResponseDTO> responseDTOS=nxtToEfsMapper.convertEfsToNXTResponse(result);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, responseDTOS, null);
        return ResponseEntity.ok(responseDTO);

    }

    @PutMapping(value = "/update-call", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> updateCall(@RequestBody CallEntryNxtRequestDTO callEntryNxtRequestDTO, @RequestParam String username, @RequestParam(required = false) String user_token, @RequestParam String call_id) {

        CallEntryResponseDTO result = serviceLayer.updateCall(username, user_token, call_id, callEntryNxtRequestDTO.getCallType(), callEntryNxtRequestDTO.getSubType(), callEntryNxtRequestDTO.getNote(), callEntryNxtRequestDTO.getMode().toString(), commonUtil.convertDate(callEntryNxtRequestDTO.getDate(),"dd-MMM-yy").toUpperCase());
        result.setCallNo(call_id);
        result.setCustomerId(callEntryNxtRequestDTO.getCustomerId());
        result.setCustomerName("");
        result.setCallOwnerId(null);
        result.setCallOwnerName("");
        result.setMode(callEntryNxtRequestDTO.getMode());
        result.setCallType(callEntryNxtRequestDTO.getCallType());
        result.setSubType(callEntryNxtRequestDTO.getSubType());
        result.setDate(format.format(callEntryNxtRequestDTO.getDate()));
        result.setNote(callEntryNxtRequestDTO.getNote());
        result.setIsFollowUpRequired(YesNo.Yes);
        result.setIsFollowUpCompleted(YesNo.No);
        result.setFollowupDate(null);
        result.setFollowAction(null);
        result.setScheduleFollowUpDate(null);
        result.setStatus(CallEntryStatus.Scheduled);
        result.setIsInstantCustomer(null);
        result.setCustomerAddressRespone(new ArrayList<>());
        result.setCustomerContactRespone(new ArrayList<>());
        result.setCustomerContactDetailResponseDTO(new ArrayList<>());
        result.setProductDetailResponseDTO(new ArrayList<>());
        result.setQuestionnaireDTO(new ArrayList<>());
        result.setCompetitorResponseDTO(new ArrayList<>());
        result.setAttachmentsResponsetDTO(new ArrayList<>());
        List<CallEntryJointCallInfoResponseDTO> callEntryJointCallInfoResponseDTO = new ArrayList<>();
        for (CallEntryJointCallInfoRequestDTO callEntryJointCallInfoRequestDTO : callEntryNxtRequestDTO.getJointCallInfoRequestDTOList()) {
            CallEntryJointCallInfoResponseDTO jointCallInfoResponseDTO = new CallEntryJointCallInfoResponseDTO();
            jointCallInfoResponseDTO.setDescription(callEntryJointCallInfoRequestDTO.getDescription());
            callEntryJointCallInfoResponseDTO.add(jointCallInfoResponseDTO);

        }
        result.setJointCallInfoResponseDTO(callEntryJointCallInfoResponseDTO);


        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);

    }

    @PutMapping(value = "/update-follow-up",consumes =MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StatusResponseDTO> updateFollowUp(@RequestBody CallEntryNxtRequestDTO nxtRequestDTO,@RequestParam String username,@RequestParam(required = false)String user_token,@RequestParam String call_id){

            StatusResponseDTO result=serviceLayer.updateFollowup(username,user_token,call_id,nxtRequestDTO.getIsFollowUpCompleted().toString(),nxtRequestDTO.getNote(),format.format(nxtRequestDTO.getFollowupDate()),nxtRequestDTO.getFollowAction(),nxtRequestDTO.getMode().toString(),format.format(nxtRequestDTO.getDate()));
            return ResponseEntity.ok(result);
    }


    @PostMapping(value = "/custom/sign-in", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> login(@RequestBody AuthenticationRequestauthenticationRequest requestauthenticationRequest) {


        EfsLoginResponseDTO result = serviceLayer.efsLoginAPI(requestauthenticationRequest.getUserName(), requestauthenticationRequest.getPassword());
        log.info("EFS login Api called");
        SpringSecurityUser responseDTO = new SpringSecurityUser();
        if (result.getLogindetail() != null && result.getLogindetail().getUsertoken() != null) {
            responseDTO.setAccess_token(result.getLogindetail().getUsertoken());
            responseDTO.setId_token(result.getLogindetail().getUsertoken());
            responseDTO.setRefresh_token(result.getLogindetail().getUsertoken());
        }
        responseDTO.setTokenType("Jwt");

        ResponseDTO responseDTO1 = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, responseDTO, null);
        log.info("/api/v1/efs-il/efs-mobile-callEntries/custom/sign-in executed successfully");
        return ResponseEntity.ok(responseDTO1);

    }

    @PostMapping(value = "/forgot-password", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> forgotPassword(@RequestParam String username) {

        String result = serviceLayer.forgotPassword(username);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> logout(@RequestParam String username, @RequestParam String deviceToken) {

        UserProfileResponse result = serviceLayer.logout(username, deviceToken);
        result.setUserName(username);
        result.setFirstName("");
        result.setLastName("");
        result.setApplicationName(NotificationRequest.ApplicationName.FREIGHTX);
        result.setUserDeviceTokens(new ArrayList<>());
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping(value = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> changePassword(@RequestParam String username, @RequestParam(required = false) String user_token,
                                                      @RequestParam(required = false) String new_password) {

        String result = serviceLayer.changePassword(username, user_token, new_password);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/customer-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getEfsCustomerList(@RequestParam String username, @RequestParam(required = false) String user_token,
                                                          @RequestParam(required = false) String updateddata, @RequestParam(required = false) String lastmodifieddate) {

        EfsCustomerListResponseDTO result = serviceLayer.customerList(username, user_token, updateddata, lastmodifieddate);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/customer-by-searchkey", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getCustomerBySearchKey(@RequestParam String username, @RequestParam(required = false) String user_token,
                                                              @RequestParam(required = false) String searchkey) {

        EfsCustomerListResponseDTO result = serviceLayer.getCustomerBySearchKey(username, user_token, searchkey);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);

    }

    @GetMapping(value = "/employee-detail", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getEmployeeDetail(@RequestParam String username, @RequestParam(required = false) String user_token) {
        EfsEmployeeDetailResponseDTO result = serviceLayer.employeeDetail(username, user_token);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/get-salesman", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getSalesman(@RequestParam String username, @RequestParam(required = false) String user_token) {
        EfsSalesmanResponseDTO result = serviceLayer.getSalesman(username, user_token);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @PostMapping(value = "/create-enquiry", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> createEnquiry(@RequestParam String username, @RequestParam(required = false) String user_token, @RequestParam(required = false) String Salesmancode,
                                                     @RequestParam(required = false) String sCustcode, @RequestParam(required = false) String sSegmentcode, @RequestParam(required = false) String sPOR,
                                                     @RequestParam(required = false) String sPOL, @RequestParam(required = false) String sPOD, @RequestParam(required = false) String sFDC, @RequestParam(required = false) String sTerms,
                                                     @RequestParam(required = false) String sType, @RequestParam(required = false) String sRouted, @RequestParam(required = false) String sNvocc) {
        String result = serviceLayer.newEnquiry(username, user_token, Salesmancode, sCustcode, sSegmentcode, sPOR, sPOL, sPOD, sFDC, sTerms, sType, sRouted, sNvocc);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/get-enquiry-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getEnquiryList(@RequestParam String username, @RequestParam(required = false) String user_token,
                                                      @RequestParam(required = false) String Salesmancode) {
        EfsEnquiryResponseDTO result = serviceLayer.getEnquiryList(username, user_token, Salesmancode);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }

}
