package com.newage.fx.lookupdata.service.client;

import com.newage.fx.lookupdata.service.client.dto.response.ClientResponseDTO;
import com.newage.fx.lookupdata.service.client.dto.response.TenantResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "tenantservice", url = "${feign.client.tenants.url}")
public interface TenantsServiceClient {

    @GetMapping("/api/v1/tenantservice/tenants/{tenantId}")
    ClientResponseDTO<TenantResponseDTO> getTenantByTenantId(@PathVariable("tenantId") String tenantId);

}
