package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallEntryAttachmentsResponsetDTO {
    private Long id;
    private Long documentTypeId;
    private String referenceNo;
    private String documentUrl;
    private String name;
    private String format;
    private String alfrescoNodeId;

    /*@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocumentTypeMasterDTO {
        private Long id;
        private String name;
    }*/
}
