package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.LovStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoleResponseDTO {
    private Long id;
    private String name;
    private String description;
    private LovStatus status;
    private String roleType;
    private List<RoleHasFeatureResponseDTO> featuresList;
}
