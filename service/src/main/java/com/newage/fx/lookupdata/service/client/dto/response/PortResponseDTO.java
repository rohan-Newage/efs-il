package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.TransportMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PortResponseDTO {
	private Long id;
    private String code;
    private String name;
    private TransportMode transportMode;
    private String countryCode;
}
