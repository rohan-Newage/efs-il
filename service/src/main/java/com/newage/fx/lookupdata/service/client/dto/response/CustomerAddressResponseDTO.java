package com.newage.fx.lookupdata.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerAddressResponseDTO {
    private Long id;
    private boolean communicationAddress;
    private boolean corporateAddress;
    private String streetName;
    private String poBoxNo;
    private String buildingNoName;
    private Double latitude;
    private Double longitude;
    private String locationName;
    private String address1;
    private String address2;
    private String address3;
    private CityMasterDTO city;
    private StateMasterDTO state;
    private CountryMasterDTO country;
    private String zipCode;
    private List<String> email;
    private List<MobileNumberDTO> mobileNumbers;
    private List<PhoneNumberDTO> phoneNumbers;
    private AddressTypeDTO addressType;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddressTypeDTO {

        private Long id;
        private String addressType;
        private String status;

    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PhoneNumberDTO {
        private String phonePrefix;
        private String phoneNumber;
    }


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MobileNumberDTO {
        private String mobilePrefix;
        private String mobileNumber;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CityMasterDTO {

        private Long id;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StateMasterDTO {

        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CountryMasterDTO {

        private Long id;
        private String code;
        private String name;
    }
}
