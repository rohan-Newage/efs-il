package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CallEntryCompetitorRequestDTO {
	private  Long id;
	@NotNull
	private Long competitorId;
	private Long serviceId;
	private Long originId;
	private Long destinationId;
	private String rate;
}
