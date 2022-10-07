package com.newage.fx.lookupdata.service.client.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerContactRequestDTO {
	private Long designationId;
	private Long customerId;
	private String name;
	private String mobileNo;
	private String email;
	private Long customerContactId;
}
