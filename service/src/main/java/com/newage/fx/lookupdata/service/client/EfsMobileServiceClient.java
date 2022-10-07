package com.newage.fx.lookupdata.service.client;

import com.newage.fx.lookupdata.service.client.dto.response.EfsLoginDetailResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "efsService",url = "${feign.client.efs.url}")
public interface EfsMobileServiceClient {

    @GetMapping("/CallEntry_S1NTR/webservice.asmx/callhistory?username=string&user_token=string&customer_code=string")
    public void getCallEntries(@RequestHeader String userName,@RequestHeader String userToken);

    @GetMapping("/CallEntry_S1NTR/webservice.asmx/newcall")
   public void createCallEntry(@RequestParam String username, @RequestParam String user_token, @RequestParam String cus_code,
                                                             @RequestParam String call_type, @RequestParam String sub_type,
                                                             @RequestParam String call_mode, @RequestParam String desc,
                                                             @RequestParam String follow_date, @RequestParam String follow_action, @RequestParam String create_date);

    @GetMapping("/CallEntry_S1NTR/webservice.asmx/login")
    EfsLoginDetailResponseDTO efsLogin(@RequestParam String username , @RequestParam String password);

    @GetMapping("/CallEntry_S1NTR/webservice.asmx/forgotpassword")
    public void forgotPassword(@RequestParam String username);

}
