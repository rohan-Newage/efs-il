package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerContactResponseDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private boolean primary;
	private DesignationMasterDTO designation;
	private List<MobileNumberDTO> mobileNumbers;
	private List<String> email;

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class DesignationMasterDTO {

		private Long id;
		private String name;
	}

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class MobileNumberDTO {
		private String mobilePrefix;
		private String mobileNumber;
	}
}
