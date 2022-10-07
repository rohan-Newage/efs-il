package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallEntryAttachmentsRequestDTO {
    private Long id;
    private Long documentTypeId;
    private String referenceNo;
    private String document;
    private String name;
    private String format;
}
