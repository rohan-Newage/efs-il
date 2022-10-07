package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.LovStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AircraftMasterResponseDTO {

    private Long id;
    private String icaoCode;
    private String model;
    private String iataTypeCode;
    private LovStatus status;
}
