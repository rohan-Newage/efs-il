package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AgentResponseDTO {

    private Long id;
    private String code;
    private String name;
    private List<AgentAddressResponseDTO> agentAddressResponseDTO;

}
