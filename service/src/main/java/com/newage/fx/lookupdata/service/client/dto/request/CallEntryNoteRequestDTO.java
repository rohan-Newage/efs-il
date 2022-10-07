package com.newage.fx.lookupdata.service.client.dto.request;

import com.newage.fx.lookupdata.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CallEntryNoteRequestDTO {
    private String note;
    private YesNo followUpRequired;
    private Date followUpDate;
    private Date followUpTime;
    private String followUpAction;
}
