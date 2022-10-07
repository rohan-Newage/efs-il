package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {
    private Long id;
    private String storage_id;
    private String message_id;
    private String storage_path;
    private String storage_type;
}
