package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EfsCustomerListResponseDTO {

    private List<EfsCustomerInfoResponseDTO> customerlist;
}
