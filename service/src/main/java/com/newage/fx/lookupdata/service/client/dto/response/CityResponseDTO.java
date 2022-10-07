
package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityResponseDTO {

    private Long id;
    private String name;
    private Country country;
    private State state;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Country {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class State {
        private Long id;
        private String code;
        private String name;
    }
}