package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TriggerResponseDTO {
    private Long id;
    private String name;
    private String code;
    private String note;
    private String mailSubject;

}
