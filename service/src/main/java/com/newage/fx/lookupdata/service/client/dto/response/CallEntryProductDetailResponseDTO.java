package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallEntryProductDetailResponseDTO {
    private Long id;
    private Long serviceId;
    private String serviceName;
    private Long originId;
    private String originName;
    private Long destinationId;
    private String destinationName;
    private Long tosId;
    private String tosName;
    private Long frequencyId;
    private String frequencyName;
    private Integer noOfShipment;
    private Long customerProfileId;
}
