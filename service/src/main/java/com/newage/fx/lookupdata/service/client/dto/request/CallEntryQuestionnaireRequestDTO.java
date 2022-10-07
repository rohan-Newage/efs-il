package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CallEntryQuestionnaireRequestDTO {
	private Long id;
	private Long questionId;
	private List<CallEntryQuestionnaireResponsesRequestDTO> callEntryResponses;
}
