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
public class TriggerCondition {

    private String sqlClause;
    private Map<String, String> condMap;

    public Boolean validateSQLClause(String sqlString){
        return null;
    }

}
