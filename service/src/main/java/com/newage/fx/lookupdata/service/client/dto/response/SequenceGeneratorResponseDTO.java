package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.SequenceFormat;
import com.newage.fx.lookupdata.domain.enums.SequenceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SequenceGeneratorResponseDTO {

    private Long id;
    private String sequenceName;
    private SequenceType sequenceType;
    private long currentSequenceValue;
    private String prefix;
    private SequenceFormat format;
    private String suffix;
    private String separator;

}