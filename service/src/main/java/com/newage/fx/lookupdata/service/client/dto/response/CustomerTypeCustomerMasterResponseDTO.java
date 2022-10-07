package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerTypeCustomerMasterResponseDTO {
    private Long id;
    private CustomerTypeMasterDTO customerType;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerTypeMasterDTO {
        private Long id;
        private String name;


    }
}
