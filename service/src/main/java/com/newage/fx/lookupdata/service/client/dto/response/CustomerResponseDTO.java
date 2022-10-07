package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDTO {
    private Long id;
    private String name;
    private String code;
    private GradeMasterDTO grade;
    private CustomerStatusDto customerStatus;
    private List<CustomerTypeCustomerMasterResponseDTO> customerType;
    private List<CustomerAddressResponseDTO> addresses;
    private List<CustomerContactResponseDTO> contacts;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerTypeResponseDTO {
        private Long id;
        private String name;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GradeMasterDTO {
        private Long id;
        private String name;
        private String colourCode;
    }

    public enum CustomerStatusDto {
        Active, Rejected, OnHold, Approved, Instant, InActive,Agent
    }
}
