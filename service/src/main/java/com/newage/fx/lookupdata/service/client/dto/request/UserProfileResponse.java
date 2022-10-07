package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserProfileResponse {

    private Long id;
    private String userName;
    private NotificationRequest.ApplicationName applicationName;
    private String firstName;
    private String lastName;
    private Set<UserChannelResponse> channels;
    private List<UserDeviceTokenResponseDTO> userDeviceTokens;


}
