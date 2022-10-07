package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CallEntryProductDetailRequestDTO {
    private Long id;
    @NotNull
    private Long serviceId;
    private Long originId;
    private Long tosId;
    private Long destinationId;
    private Long frequencyId;
    private Integer noOfShipment;
    private Long customerProfileId;

}
