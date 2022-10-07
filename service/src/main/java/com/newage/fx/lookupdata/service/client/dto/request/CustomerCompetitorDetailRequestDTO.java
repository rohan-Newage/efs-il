package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCompetitorDetailRequestDTO {
	private Long competitorId;
	private Double rate;
	private String note;
}
