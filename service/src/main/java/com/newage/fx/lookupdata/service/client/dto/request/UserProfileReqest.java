package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Builder
public class UserProfileReqest {

    @NotBlank
    private String userName;
    @NotNull
    private NotificationRequest.ApplicationName applicationName;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotNull
    private Set<UserChannelRequest> channels;

}
