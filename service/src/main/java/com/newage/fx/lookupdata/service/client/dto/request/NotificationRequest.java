package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Data;

import java.util.Set;

@Data
public class NotificationRequest {

    private ApplicationName applicationName;

    private String title;
    private String body;

    private Set<ChannelType> channelTypes;
    private Set<String> userNames;

    public enum ApplicationName {
        FREIGHTX
    }

    public enum ChannelType {
        SMS, APP, WEB, WHATSAPP, EMAIL
    }

}
