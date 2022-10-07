package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GradeResponseDTO {
    private Long id;

    private String name;

    private Priority priority;

    private String colourCode;

}
