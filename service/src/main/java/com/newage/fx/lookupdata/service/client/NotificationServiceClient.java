package com.newage.fx.lookupdata.service.client;

import com.newage.fx.lookupdata.service.client.dto.request.NotificationMessageDTO;
import com.newage.fx.lookupdata.service.client.dto.request.NotificationRequest;
import com.newage.fx.lookupdata.service.client.dto.request.PushNotificationRequestDTO;
import com.newage.fx.lookupdata.service.client.dto.response.NotificationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "notificationService", url = "${feign.client.notification.url}")
public interface NotificationServiceClient {

	@PostMapping("/publish")
    NotificationResponse publishNotification(@RequestBody NotificationRequest notificationRequest);


    @PostMapping("/trigger")
    public void triggerNotification(@RequestBody NotificationMessageDTO notificationMessageDTO) ;

    @PostMapping("/send-push-notification")
    public void sendPushNotification(@RequestBody PushNotificationRequestDTO notificationRequestDTO
            ,@RequestParam String userName);

}
