package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceMappingResponseDTO {

    private Long id;
    private ServiceMappingMasterDTO importService;
    private ServiceMappingMasterDTO exportService;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ServiceMappingMasterDTO {
        private Long id;
        private String code;
        private String name;
    }
}