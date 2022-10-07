package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.ZoneOffset;
import java.util.Set;

@Builder
@Data
public class TriggerSchedule {

    private Date beginDate;
    private Time startTime;
    private Date finishDate;
    private Time finishTime;

    private String step;
    private String unit;

    private ZoneOffset timeZoneOffset;
    private Boolean isSyncStartRequired;

    private String cronExpression;
    private Set<Timestamp> scheduleTimestamps;

}
