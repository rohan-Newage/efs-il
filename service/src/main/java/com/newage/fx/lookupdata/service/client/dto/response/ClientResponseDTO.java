package com.newage.fx.lookupdata.service.client.dto.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO<T> {

    private Integer httpStatus;

    private Boolean success;

    private Date timestamp;

    private T result;

    private ResponseError error;

    public Date getTimestamp() {

        return Calendar.getInstance().getTime();
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonRootName(value = "error")
    public static class ResponseError {

        private String code;

        private List<String> message;

    }
}