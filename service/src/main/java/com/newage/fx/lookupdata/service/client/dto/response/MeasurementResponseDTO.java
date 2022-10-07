package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementResponseDTO {
    private Long id;

    private String code;

    private String name;

    private String unit1;
}
