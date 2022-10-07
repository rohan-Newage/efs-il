package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CallEntryQuestionnaireResponseDTO {
    private Long id;
    private Long questionId;
    private List<CallEntryQuestionnaireResponsesResonseDTO> responses;
}
