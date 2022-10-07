package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageModel {
    private String channnel;

    private Set<String> senderList;
    private Set<String> receipientList;


    private TransactionData transactionData;
    private String templateId;
    private Set<String> templateKeys;

    private List<Attachment> attachment;

}
