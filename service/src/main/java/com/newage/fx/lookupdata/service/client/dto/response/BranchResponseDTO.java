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
public class BranchResponseDTO {

    private Long id;
    private String logo;
    private String name;
    private String code;
    private String logoUrl;
    private AgentMasterDTO agent;
    private List<BranchAddressResponseDTO> branchAddressMasterList;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AgentMasterDTO {
        private Long id;
        private String code;
        private String name;
    }
}
