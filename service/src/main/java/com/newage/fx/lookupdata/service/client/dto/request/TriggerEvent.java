package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TriggerEvent{
    @Enumerated(EnumType.STRING)
    private ProductName product;
    private String feature;
    private String event;
}
