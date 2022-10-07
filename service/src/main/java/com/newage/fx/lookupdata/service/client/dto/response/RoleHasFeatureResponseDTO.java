package com.newage.fx.lookupdata.service.client.dto.response;

import com.amazonaws.util.Platform;
import com.newage.fx.lookupdata.domain.enums.Domain;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Type;

@Getter
@Setter
public class RoleHasFeatureResponseDTO {

    private Long id;
    Long featureId;
    private String featureName;
    private String featureValue;
    boolean createVisible;
    boolean modifyVisible;
    boolean viewVisible;
    boolean deleteVisible;
    boolean createChecked;
    boolean modifyChecked;
    boolean viewChecked;
    boolean deleteChecked;
    Platform platform;
    Domain domain;
    Type type;
}