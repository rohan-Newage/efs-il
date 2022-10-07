package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class UserChannelRequest {

    @NotNull
    private NotificationRequest.ChannelType channelType;

    @NotBlank
    private String recipientAddress;
}
