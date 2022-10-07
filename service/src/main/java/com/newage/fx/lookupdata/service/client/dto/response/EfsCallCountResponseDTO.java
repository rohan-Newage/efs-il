package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EfsCallCountResponseDTO {

    private String date;
    private String deviatedcount;
    private String completedplannedcalls;
}
