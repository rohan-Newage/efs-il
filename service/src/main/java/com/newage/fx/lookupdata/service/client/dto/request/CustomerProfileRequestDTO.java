package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerProfileRequestDTO {
	private Long id;
    private Long serviceId;
    private Long frequencyId;
    private Long originId;
    private Long destinationId;
    private Long commodityId;
    private Long tosId;
    private Integer noOfShipment;
    private Double volume;
    private Double weight;
    private Long controllerBy;
    private String consignee;
    private Long callEntryId;
    private Long customerProfileId;
    private Long customerId;
    private List<CustomerCompetitorDetailRequestDTO> customerCompetitorDetailRequestDTO;
}
