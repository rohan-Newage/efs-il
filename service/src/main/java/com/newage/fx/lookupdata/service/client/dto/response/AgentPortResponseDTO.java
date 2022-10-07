package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgentPortResponseDTO {
    private Long id;
    private AgentMasterDTO agentName;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AgentMasterDTO {
        private Long id;
        private String code;
        private String name;
    }
}
