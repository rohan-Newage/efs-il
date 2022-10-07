package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Data;

@Data
public class UserChannelResponse {

    private Long id;
    private NotificationRequest.ChannelType channelType;
    private String recipientAddress;
}
