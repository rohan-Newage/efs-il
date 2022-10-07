package com.newage.fx.lookupdata.service;

import com.newage.fx.lookupdata.service.client.dto.request.UserProfileResponse;
import com.newage.fx.lookupdata.service.client.dto.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Service
public class ServiceLayer {

    private final RestTemplate restTemplate;


    @Autowired
    public ServiceLayer(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public String forgotPassword(@RequestParam String username){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/forgotpassword?username={username}",String.class,username);
    }

    public String changePassword(@RequestParam String username,@RequestParam String user_token,@RequestParam String new_password){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/changepassword?username={username}&user_token={user_token}&new_password={new_password}",String.class,username,user_token,new_password);
    }


    public EfsLoginResponseDTO efsLoginAPI(@RequestParam String username, @RequestParam String password){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/login?username={username}&password={password}",EfsLoginResponseDTO.class,username,password);
    }

    public UserProfileResponse logout(@RequestParam String username, @RequestParam String user_token){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/logout?username={username}&user_token={user_token}",UserProfileResponse.class,username,user_token);
    }


    public EfsCustomerListResponseDTO customerList(@RequestParam String username , @RequestParam String user_token,
                                                   @RequestParam String updateddata, @RequestParam String lastmodifieddate){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/customer?username={username}&user_token={user_token}&updateddata={updateddata}&lastmodifieddate={lastmodifieddate}",EfsCustomerListResponseDTO.class
                                            ,username,user_token, updateddata,lastmodifieddate);
    }

    public EfsCustomerListResponseDTO getCustomerBySearchKey(@RequestParam String username,@RequestParam String user_token,
                                         @RequestParam String searchkey){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/customer_search?=username={username}&user_token={user_token}&searchkey={searchkey}",EfsCustomerListResponseDTO.class,username,user_token,searchkey);
    }

    public EfsEmployeeDetailResponseDTO employeeDetail(@RequestParam String username, @RequestParam String user_token){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/employeedetail?username={username}&user_token={usertoken}",EfsEmployeeDetailResponseDTO.class,username,user_token);
    }

    public EfsSalesmanResponseDTO getSalesman(@RequestParam String username, @RequestParam String user_token){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/salesman?username={username}&user_token={usertoken}",EfsSalesmanResponseDTO.class,username,user_token);
    }

    public CallEntryResponseDTO newCall(@RequestParam String username, @RequestParam String user_token, @RequestParam String cus_code,
                                        @RequestParam String call_type, @RequestParam String sub_type,
                                        @RequestParam String call_mode, @RequestParam String desc,
                                        @RequestParam String follow_date, @RequestParam String follow_action, @RequestParam String create_date, @RequestParam String jointcalls){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/newcall?username={username}&user_token={user_token}&cus_code={cus_code}&call_type={call_type}&sub_type={sub_type}&call_mode={call_mode}&desc={desc}&follow_date={follow_date}&follow_action={follow_action}&create_date={create_date}&jointcalls={jointcalls}"
                                     ,CallEntryResponseDTO.class,username,user_token, cus_code,call_type,sub_type,call_mode,desc,follow_date,follow_action,create_date,jointcalls);
    }

    public StatusResponseDTO updateFollowup(@RequestParam String username, @RequestParam String user_token, @RequestParam String call_id,
                                        @RequestParam String completed, @RequestParam String desc,
                                        @RequestParam String follow_date, @RequestParam String follow_action,@RequestParam String call_mode,
                                        @RequestParam String run_date){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/updatefollowup?username={username}&user_token={user_token}&call_id={call_id}&completed={completed}&desc={desc}&follow_date={follow_date}&follow_action={follow_action}&call_mode={call_mode}&run_date={run_date}",StatusResponseDTO.class,username,
                user_token,call_id,completed,desc,follow_date,follow_action,call_mode,run_date);
    }

    public EfsCallResponseDTO getCallList(@RequestParam String username, @RequestParam String user_token,
                                                   @RequestParam String Salesmancode){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/calllist?username={username}&user_token={user_token}&Salesmancode={Salesmancode}",
                                        EfsCallResponseDTO.class,username,user_token,Salesmancode);
    }

    public String newEnquiry(@RequestParam String username,@RequestParam String user_token,@RequestParam String Salesmancode,
                             @RequestParam String sCustcode,@RequestParam String sSegmentcode,@RequestParam String sPOR,
                             @RequestParam String sPOL,@RequestParam String sPOD,@RequestParam String sFDC,@RequestParam String sTerms,
                             @RequestParam String sType,@RequestParam String sRouted,@RequestParam String sNvocc){

        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/Createenquiry?username={username}&user_token={user_token}&Salesmancode={Salesmancode}&sCustcode={sCustcode}&sSegmentcode={sSegmentcode}&sPOR={sPOR}&sPOL={sPOL}&sPOD={sPOD}&sFDC={sFDC}&sTerms={sTerms}&sType={sType}&sRouted={sRouted}&sNvocc={sNvocc}",
                             String.class, username,user_token, Salesmancode,sCustcode,sSegmentcode,sPOR,sPOL,sPOD,sFDC,sTerms,sType,sRouted,sNvocc);

    }

    public CallEntryResponseDTO updateCall(@RequestParam String username,@RequestParam String user_token,@RequestParam String call_id,
                             @RequestParam String call_type,@RequestParam String sub_type,@RequestParam String desc,
                             @RequestParam String call_mode,@RequestParam String run_date){

        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/updatecall?username={username}&user_token={user_token}&call_id={call_id}&call_type={call_type}&sub_type={sub_type}&desc={desc}&call_mode={call_mode}&run_date={run_date}"
                                        ,CallEntryResponseDTO.class,username,user_token,call_id,call_type,sub_type,desc,call_mode,run_date);
    }

    public EfsEnquiryResponseDTO getEnquiryList(@RequestParam String username,@RequestParam(required = false) String user_token,
                                                @RequestParam(required = false) String Salesmancode){
        return restTemplate.getForObject("https://efreightsuite.com/CallEntry_S1NTR/webservice.asmx/GetEnquiryList?username={username}&user_token={user_token}&Salesmancode={Salesmancode}",EfsEnquiryResponseDTO.class,
                                         username,user_token,Salesmancode);
    }



}