package com.newage.fx.lookupdata.service.client.dto.request;

import com.amazonaws.services.simpleemail.model.NotificationType;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class PushNotificationRequestDTO {
    private String subject;
    private String content;
    private NotificationType notificationType;
    private boolean actionRequired = false;
    private Map<String, String> data;
    private String image;
}