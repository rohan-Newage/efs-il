package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationMessageDTO {
    private String isAuto;
    private String triggerName;
    private String triggerType;
    private TriggerEvent triggerEvent;
    private TriggerCondition triggerCondition;
    private TriggerSchedule triggerSchedule;
    private Map<String, MessageModel> messageModelMap;
    private Map<String, String> transactionDataQueryAttributesMap;
}
