package com.newage.fx.lookupdata.service.client;

import com.newage.fx.lookupdata.domain.enums.FullGroupage;
import com.newage.fx.lookupdata.domain.enums.ImportExport;
import com.newage.fx.lookupdata.domain.enums.TransportMode;
import com.newage.fx.lookupdata.service.client.dto.request.CustomerContactRequestDTO;
import com.newage.fx.lookupdata.service.client.dto.request.CustomerProfileRequestDTO;
import com.newage.fx.lookupdata.service.client.dto.response.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "masterdata", url = "${feign.client.referencedata.url}")
public interface MasterDataServiceClient {

    @GetMapping("/api/v1/masterdata/customers/{id}")
    ClientResponseDTO<CustomerResponseDTO> getCustomerById(@PathVariable("id") Long id);

    // Change once customer api is developed
    // use this api to get employee date- salesman,customer contact person,followup
    // by person,
    @GetMapping("/api/v1/masterdata/employee/{id}")
    ClientResponseDTO<EmployeeResponseDTO> getEmployeeById(@PathVariable("id") Long id);

    // use this api to get AircraftType
    @GetMapping("/api/v1/masterdata/aircraft/{id}")
   ClientResponseDTO<AircraftMasterResponseDTO> getAircraftTypeById(@PathVariable("id") Long id);

    // use this api to get flightType
    @GetMapping("/api/v1/masterdata/flighttype/{id}")
    ClientResponseDTO<FlightTypeResponseDTO> getFlightTypeById(@PathVariable("id") Long id);

    // use this api to get Calltype info
    @GetMapping("/api/v1/masterdata/calltypes/{id}")
    ClientResponseDTO<CallTypeResponseDTO> getCallTypeById(@PathVariable("id") Long id);

    // use this api to get Calltype info
    @GetMapping("/api/v1/masterdata/calltypes/{id}/statuses/{statusId}")
    ClientResponseDTO<CallTypeStatusResponseDTO> getCallTypeStatusByStatusId(@PathVariable("id") Long callTypeId,
                                                                             @PathVariable("statusId") Long statusId);

    // Change once followupaction master api is developed
    // use this api to get Calltype status
    @GetMapping("/api/v1/masterdata/followups/{id}")
    ClientResponseDTO<FollowUpResponseDTO> getFollowupActionctionById(@PathVariable("id") Long id);

    // use this api to get designation info
    @GetMapping("/api/v1/masterdata/designation/{id}")
    ClientResponseDTO<DesignationResponseDTO> getDesignationById(@PathVariable("id") Long id);

    // use this api to get Country info
    @GetMapping("/api/v1/masterdata/countries/{id}")
    ClientResponseDTO<CountryResponseDTO> getCountryById(@PathVariable("id") Long id);

    // use this api to get State info
    @GetMapping("/api/v1/masterdata/states/{id}")
    ClientResponseDTO<StateResponseDTO> getStateById(@PathVariable("id") Long id);

    // use this api to get citi info
    @GetMapping("/api/v1/masterdata/cities/{id}")
    ClientResponseDTO<CityResponseDTO> getCityById(@PathVariable("id") Long id);

    //use this api to update customer new contact details
    @PostMapping("/api/v1/masterdata/customers/update-contactinfo")
    ClientResponseDTO<CustomerContactResponseDTO> updateCustomerContactDetails(
            @RequestBody CustomerContactRequestDTO customerContactRequestDTO);

    //use this api to update customer new profile details
    @PostMapping("/api/v1/masterdata/customers/update-profiledetail")
    ClientResponseDTO<CustomerProfileResponseDTO> updateCustomerProfileDetails(
            @RequestBody CustomerProfileRequestDTO customerProfileRequestDTO);

    //use this api to get service info
    @GetMapping("/api/v1/masterdata/services/{id}")
    ClientResponseDTO<ServiceResponseDTO> getServiceById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/services/{code}/{trade}")
    ClientResponseDTO<ServiceResponseDTO> getServiceByCodeAndTrade(@PathVariable("code") String code, @PathVariable("trade") ImportExport trade);

    @GetMapping("/api/v1/masterdata/frequencymaster/{id}")
    ClientResponseDTO<FrequencyResponseDTO> getFrequencyId(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/port/{id}")
    ClientResponseDTO<PortResponseDTO> getPortById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/hscodes/{id}")
    ClientResponseDTO<HSCodeResponseDTO> getHSCodeById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/tos/{id}")
    ClientResponseDTO<TosResponseDTO> getTosById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/competitors/{id}")
    ClientResponseDTO<CompetitorResponseDTO> getCompetitorById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/questionnaires/{id}")
    ClientResponseDTO<QuestionnnaireResponseDTO> getQuestionById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/measurements/{id}")
    ClientResponseDTO<MeasurementResponseDTO> getMeasurementById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/unit/{id}")
    ClientResponseDTO<UnitResponseDTO> getUnitById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/sequencegenerators/by-type/{type}")
    ClientResponseDTO<String> getSequenceByType(@PathVariable("type") String type);

    @GetMapping("/api/v1/masterdata/documenttypes/{id}")
    ClientResponseDTO<DocumentTypeResponseDTO> getDocumentTypeById(@PathVariable("id") Long id);

    // use this api to get department info
    @GetMapping("/api/v1/masterdata/departments/{id}")
    ClientResponseDTO<DepartmentResponseDTO> getDepartmentById(@PathVariable("id") Long id);

    // use this api to get currency info
    @GetMapping("/api/v1/masterdata/currencies/{id}")
    ClientResponseDTO<CurrencyResponseDTO> getCurrencyById(@PathVariable("id") Long id);

    // use this api to get charge info
    @GetMapping("/api/v1/masterdata/charges/{id}")
    ClientResponseDTO<ChargeResponseDTO> getChargeById(@PathVariable("id") Long id);

    // use this api to get carrier info
    @GetMapping("/api/v1/masterdata/carriermaster/{id}")
    ClientResponseDTO<CarrierResponseDTO> getCarrierById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/agents/{id}")
    ClientResponseDTO<AgentResponseDTO> getAgentById(@PathVariable("id") Long id);


    @GetMapping("/api/v1/masterdata/container/{id}")
    ClientResponseDTO<ContainerResponseDTO> getContainerById(@PathVariable("id") Long id);


    // use this api to get agent port  info
    @GetMapping("/api/v1/masterdata/agentportmaster/{id}")
    ClientResponseDTO<AgentPortResponseDTO> getAgentPortDetailsById(@PathVariable("id") Long id);


    @GetMapping("/api/v1/masterdata/agents/{id}/agentAddress")
    ClientResponseDTO<List<AgentAddressResponseDTO>> getAgentAddressByAgentId(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/carriermaster/{id}")
    ClientResponseDTO<CarrierResponseDTO> getCarrierMasterById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/customertypes/{id}")
    ClientResponseDTO<CustomerTypeResponse> getCustomerTypeById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/customers/{id}/customerAddress")
    ClientResponseDTO<List<CustomerAddressResponseDTO>> getAddressByCustomer(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/vesselmaster/{id}")
    ClientResponseDTO<VesselResponseDTO> getVesselById(@PathVariable("id") Long id);

    // use this api to get cfs info
    @GetMapping("/api/v1/masterdata/cfs/{id}")
    ClientResponseDTO<CFSResponseDTO> getCFSById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/companies/{id}")
    ClientResponseDTO<CompanyResponseDTO> getCompanyById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/branch/{id}")
    ClientResponseDTO<BranchResponseDTO> getBranchById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/customers/customerService/{employeeId}")
    ClientResponseDTO<CustomerServiceResponse> getCustomerByCustomerService(@PathVariable("employeeId") Long id);

    @GetMapping("/api/v1/masterdata/branch/{id}")
    ClientResponseDTO<BranchAddressResponseDTO> getBranchAddressById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/reason/{id}")
    ClientResponseDTO<ReasonResponseDTO> getReasonById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/customers/{id}")
    ClientResponseDTO<CustomerResponseDTO> getEMailByCustomerById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/reference/{id}")
    ClientResponseDTO<ReferenceResponseDTO> getReferenceById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/eventmaster/{id}")
    ClientResponseDTO<EventResponseDTO> getEventById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/eventmaster/code/{code}")
    ClientResponseDTO<EventResponseDTO> getEventByCode(@PathVariable("code") String code);

    @GetMapping("/api/v1/masterdata/divisions/{id}")
    ClientResponseDTO<DivisionResponseDTO> getDivisionById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/pack/{id}")
    ClientResponseDTO<PackResponseDTO> getPackById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/trigger/{id}")
    ClientResponseDTO<TriggerResponseDTO> getTriggerById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/triggerType/{id}")
    ClientResponseDTO<TriggerTypeResponseDTO> getTriggerTypeById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/import-export-servicemapping/by-import-serviceId/{serviceId}")
    ClientResponseDTO<ServiceMappingResponseDTO> getServiceMappingByImportServiceId(@PathVariable("serviceId") Long serviceId);

    @GetMapping("/api/v1/masterdata/export-import-servicemapping/by-export-serviceId/{serviceId}")
    ClientResponseDTO<ServiceMappingResponseDTO> getServiceMappingByExportServiceId(@PathVariable("serviceId") Long serviceId);

    @GetMapping("/api/v1/masterdata/agentportmaster/service-destination/{serviceId}/{destinationId}")
    ClientResponseDTO<AgentPortResponseDTO> getAgentPortInfoByServiceAndDestination(@PathVariable("serviceId") Long serviceId, @PathVariable("destinationId") Long destinationId);

    @GetMapping("/api/v1/masterdata/agentportmaster/service-destination-company/{serviceId}/{destinationId}/{companyId}")
    ClientResponseDTO<AgentPortResponseDTO> getAgentPortInfoByServiceAndDestinationAndCompany(@PathVariable("serviceId") Long serviceId,
                                                                                              @PathVariable("destinationId") Long destinationId,
                                                                                              @PathVariable("companyId") Long companyId);

    @GetMapping("/api/v1/masterdata/agentportmaster/servicename-destination/{serviceCode}/{importExport}/{destinationId}")
    ClientResponseDTO<AgentPortDetails> getAgentPortInfoByServiceNameAndDestination(@PathVariable("serviceCode") String transportMode,
                                                                                    @PathVariable("importExport") ImportExport importExport,
                                                                                    @PathVariable("destinationId") Long destinationId);
    @GetMapping("/api/v1/masterdata/agentportmaster/service-destination-company-branch/{serviceId}/{destinationId}/{companyId}/{branchId}")
     ClientResponseDTO<AgentPortResponseDTO> getAgentPortDetailsByServiceAndDestinationAndCompanyAndBranch(@PathVariable("serviceId") Long serviceId,
                                                                                              @PathVariable("destinationId") Long destinationId,
                                                                                              @PathVariable("companyId") Long companyId,
                                                                                              @PathVariable("branchId") Long branchId);

    @GetMapping("/api/v1/masterdata/grade/{id}")
    ClientResponseDTO<GradeResponseDTO> getGradeById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/drivers/{id}")
    ClientResponseDTO<DriverMasterResponseDTO> getDriverById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/services/primaryService/{mode}/{trade}/{groupage}")
    ClientResponseDTO<ServiceResponseDTO> getPrimaryServicesByTranModeTradeAndGroupage(@PathVariable("mode") TransportMode mode,
                                                                                       @PathVariable("trade") ImportExport trade,
                                                                                       @PathVariable("groupage") FullGroupage groupage);

}
