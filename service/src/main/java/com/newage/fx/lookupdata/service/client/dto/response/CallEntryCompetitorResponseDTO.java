package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallEntryCompetitorResponseDTO {
    private Long id;
    private Long competitorId;
    private String competitorName;
    private Long serviceId;
    private String serviceName;
    private Long originId;
    private String originName;
    private Long destinationId;
    private String destinationName;
    private String rate;
}
