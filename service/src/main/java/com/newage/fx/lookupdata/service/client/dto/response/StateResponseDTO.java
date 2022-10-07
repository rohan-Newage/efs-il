package com.newage.fx.lookupdata.service.client.dto.response;

import com.newage.fx.lookupdata.domain.enums.LovStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StateResponseDTO {
    private Long id;

    private String code;

    private String name;

    private LovStatus status;

    private CountryMasterDTO country;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CountryMasterDTO {

        private Long id;

        private String code;

        private String name;


    }
}
