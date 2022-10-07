package com.newage.fx.lookupdata.service.exception;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.CollectionUtils;

import java.security.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@ToString
@Log4j2
public enum ServiceErrors {

    REGION_ID_NOT_FOUND("MST-1001", "region.id.not.found"),
    COUNTRY_ID_NOT_FOUND("MST-1002", "country.id.not.found"),
    STATE_ID_NOT_FOUND("MST-1003", "state.id.not.found"),
    CITY_ID_NOT_FOUND("MST-1004", "city.id.not.found"),

    CURRENCY_ID_NOT_FOUND("MST-1005", "currency.id.not.found"),
    CURRENCY_RATE_ID_NOT_FOUND("MST-1006", "currency.rate.id.not.found"),
    CURRENCY_RATE_LINE_ITEM_IS_ALREADY_EXIST("MST-1007", "currency.rate.line.item.duplicate"),

    HS_ID_NOT_FOUND("MST-1008", "hs.id.not.found"),
    HS_CODE_ALREADY_EXIST("MST-1009", "hs.code.duplicate"),
    HS_NAME_ALREADY_EXIST("MST-1010", "hs.name.duplicate"),

    ZONE_ID_NOT_FOUND("MST-1011", "zone.id.not.found"),
    ZONE_CODE_ALREADY_EXIST("MST-1012", "zone.code.duplicate"),
    ZONE_NAME_ALREADY_EXIST("MST-1013", "zone.name.duplicate"),

    GROUP_COMPANY_ID_NOT_FOUND("MST-1014", "group.company.id.not.found"),
    GROUP_COMPANY_CODE_ALREADY_EXIST("MST-1015", "group.company.code.duplicate"),
    GROUP_COMPANY_NAME_ALREADY_EXIST("MST-1016", "group.company.name.duplicate"),
    GROUP_COMPANY_REPORTING_NAME_ALREADY_EXISTS("MST-1099", "group.company.reportingName.duplicate"),

    BRANCH_ID_NOT_FOUND("MST-1017", "branch.id.not.found"),
    BRANCH_CODE_ALREADY_EXIST("MST-1018", "branch.code.duplicate"),
    BRANCH_NAME_ALREADY_EXIST("MST-1019", "branch.name.duplicate"),
    BRANCH_REPORTING_NAME_AlREADY_EXIST("MST-1101", "branch.reportingName.duplicate"),

    DIVISION_ID_NOT_FOUND("MST-1020", "division.id.not.found"),
    DIVISION_CODE_ALREADY_EXIST("MST-1021", "division.code.duplicate"),
    DIVISION_NAME_ALREADY_EXIST("MST-1022", "division.name.duplicate"),

    COMPANY_ID_NOT_FOUND("MST-1023", "company.id.not.found"),
    COMPANY_CODE_ALREADY_EXIST("MST-1024", "company.code.duplicate"),
    COMPANY_NAME_ALREADY_EXIST("MST-1025", "company.name.duplicate"),
    COMPANY_REPORTING_NAME_ALREADY_EXIST("MST-1100", "company.reportingName.duplicate"),


    TOS_ID_NOT_FOUND("MST-1026", "tos.id.not.found"),
    TOS_CODE_ALREADY_EXIST("MST-1027", "tos.code.duplicate"),
    TOS_NAME_ALREADY_EXIST("MST-1028", "tos.name.duplicate"),

    DEPARTMENT_ID_NOT_FOUND("MST-1029", "department.id.not.found"),
    DEPARTMENT_NAME_ALREADY_EXIST("MST-1030", "department.name.duplicate"),

    GRADE_ID_NOT_FOUND("MST-1031", "grade.id.not.found"),
    GRADE_PRIORITY_ALREADY_EXIST("MST-1032", "grade.priority.duplicate"),

    PORT_ID_NOT_FOUND("MST-1033", "port.id.not.found"),
    PORT_CODE_ALREADY_EXIST("MST-1034", "port.code.duplicate"),
    PORT_NAME_ALREADY_EXIST("MST-1035", "port.name.duplicate"),

    SERVICE_ID_NOT_FOUND("MST-1036", "service.id.not.found"),
    SERVICE_CODE_ALREADY_EXIST("MST-1037", "service.code.duplicate"),
    SERVICE_NAME_ALREADY_EXIST("MST-1038", "service.name.duplicate"),

    COMPETITOR_ID_NOT_FOUND("MST-1039", "competitor.id.not.found"),
    COMPETITOR_CODE_ALREADY_EXIST("MST-1040", "competitor.code.duplicate"),
    COMPETITOR_NAME_ALREADY_EXIST("MST-1041", "competitor.name.duplicate"),

    CUSTOMER_TYPE_ID_NOT_FOUND("MST-1042", "customer.type.id.not.found"),
    CUSTOMER_TYPE_CODE_ALREADY_EXIST("MST-1043", "customer.type.code.duplicate"),
    CUSTOMER_TYPE_NAME_ALREADY_EXIST("MST-1044", "customer.type.name.duplicate"),

    CONTAINER_ID_NOT_FOUND("MST-1045", "container.id.not.found"),
    CONTAINER_CODE_ALREADY_EXIST("MST-1046", "container.code.duplicate"),
    CONTAINER_NAME_ALREADY_EXIST("MST-1047", "container.name.duplicate"),

    VALUE_ADDED_SERVICE_ID_NOT_FOUND("MST-1048", "vas.id.not.found"),
    VALUE_ADDED_SERVICE_NAME_ALREADY_EXIST("MST-1049", "vas.name.duplicate"),

    EMPLOYMENT_STATUS_ID_NOT_FOUND("MST-1050", "employment.status.id.not.found"),
    EMPLOYMENT_STATUS_NAME_ALREADY_EXIST("MST-1051", "employment.status.name.duplicate"),

    CHARGE_ID_NOT_FOUND("MST-1052", "charge.id.not.found"),
    CHARGE_CODE_ALREADY_EXIST("MST-1053", "charge.code.duplicate"),
    CHARGE_NAME_ALREADY_EXIST("MST-1054", "charge.name.duplicate"),

    YEAR_ID_NOT_FOUND("MST-1055", "year.id.not.found"),

    FREQUENCY_ID_NOT_FOUND("MST-1056", "frequency.id.not.found"),
    FREQUENCY_NAME_ALREADY_EXIST("MST-1057", "frequency.name.duplicate"),

    MEASUREMENT_ID_NOT_FOUND("MST-1058", "measurement.id.not.found"),
    MEASUREMENT_CODE_ALREADY_EXIST("MST-1059", "measurement.code.duplicate"),
    MEASUREMENT_NAME_ALREADY_EXIST("MST-1060", "measurement.name.duplicate"),

    BUSINESS_UNIT_ID_NOT_FOUND("MST-1061", "bu.id.not.found"),
    BUSINESS_UNIT_NAME_ALREADY_EXIST("MST-1062", "bu.name.duplicate"),
    BUSINESS_UNIT_CODE_ALREADY_EXIST("MST-1063", "bu.code.duplicate"),

    DESIGNATION_ID_NOT_FOUND("MST-1064", "designation.id.not.found"),
    DESIGNATION_NAME_ALREADY_EXIST("MST-1065", "designation.name.duplicate"),
    DESIGNATION_CODE_ALREADY_EXIST("MST-1154", "designation.code.duplicate"),

    CUSTOMER_ID_NOT_FOUND("MST-1066", "customer.id.not.found"),
    CUSTOMER_CODE_ALREADY_EXIST("MST-1067", "customer.code.duplicate"),

    ADDRESS_TYPE_ID_NOT_FOUND("MST-1068", "address.type.id.not.found"),
    ADDRESS_TYPE_ALREADY_EXIST("MST-1069", "address.type.duplicate"),

    EVENT_NAME_ALREADY_EXIST("MST-1070", "event.name.duplicate"),
    EVENT_ID_NOT_FOUND("MST-1071", "event.id.not.found"),
    EVENT_CODE_ALREADY_EXIST("MST-1072", "event.code.duplicate"),

    EMPLOYEE_ID_NOT_FOUND("MST-1073", "employee.id.not.found"),
    EMPLOYEE_ALIAS_NAME_ALREADY_EXIST("MST-1074", "employee.alias.name.duplicate"),

    CUSTOMER_RELATIONSHIP_ID_NOT_FOUND("MST-1075", "customer.relation.id.not.found"),

    CUSTOMER_CONTACT_ID_NOT_FOUND("MST-1076", "customer.contact.id.not.found"),
    CUSTOMER_CONTACT_NAME_ALREADY_EXIST("MST-1077", "customer.contact.name.duplicate"),
    CUSTOMER_BUSINESS_DETAIL_ID_NOT_FOUND("MST-1078", "customer.business.id.not.found"),
    CUSTOMER_BUSINESS_DETAIL_LINE_ITEM_ALREADY_EXIST("MST-1079", "customer.business.line.item.duplicate"),

    CUSTOMER_GST_ID_ALREADY_EXIST("MST-1080", "customer.gst.id.duplicate"),
    CUSTOMER_GST_ID_NOT_FOUND("MST-1081", "customer.gst.id.not.found"),

    CUSTOMER_NAME_ALREADY_EXIST("MST-1082", "customer.name.duplicate"),
    CUSTOMER_EVENT_ID_NOT_FOUND("MST-1083", "customer.event.id.not.found"),
    CUSTOMER_EVENT_TRADE_ID_NOT_FOUND("MST-1084", "customer.event.trade.id.not.found"),

    CUSTOMER_ADDRESS_TYPE_PRIMARY_ALREADY_EXIST("MST-1085", "customer.address.primary.duplicate"),
    CUSTOMER_ADDRESS_TYPE_CORPORATE_ALREADY_EXIST("MST-1086", "customer.address.corporate.duplicate"),

    CUSTOMER_ADDRESS_ID_NOT_FOUND("MST-1087", "customer.address.id.not.found"),


    CUSTOMER_VAT_ID_ALREADY_EXIST("MST-1088", "customer.vat.id.duplicate"),
    CUSTOMER_VAT_ID_NOT_FOUND("MST-1089", "customer.vat.not.found"),
    CUSTOMER_TAX_ID_ALREADY_EXIST("MST-1090", "customer.tax.id.duplicate"),
    CUSTOMER_TAX_ID_NOT_FOUND("MST-1091", "customer.tax.id.not.found"),

    CALL_TYPE_STATUS_ID_NOT_FOUND("MST-ERR-1092", "call.type.status.id.not.found"),
    CALL_TYPE_STATUS_NAME_ALREADY_EXIST("MST-ERR-1093", "call.type.status.name.duplicate"),
    CALL_TYPE_ID_NOT_FOUND("MST-1094", "call.type.id.not.found"),

    FOLLOWUP_ID_NOT_FOUND("MST-1095", "follow.up.id.not.found"),
    FOLLOWUP_NAME_ALREADY_EXIST("MST-1096", "follow.up.name.duplicate"),
    AGENT_PORT_ID_NOT_FOUND("MST-1097", "agent.port.id.duplicate"),
    AGENT_MASTER_LINE_ITEM_IS_ALREADY_EXIST("MST-1098", "agent.master.line.item.duplicate"),

    RECORD_DELETE_RESTRICTED("MST-1900", "record.delete.restricted"),

    CARRIER_MASTER_LINE_ITEM_IS_ALREADY_EXIST("MST-1102", "carrier.master.line.item.duplicate"),
    CARRIER_NAME_ALREADY_EXIST("MST-1103", "carrier.name.duplicate"),
    CARRIER_CODE_ALREADY_EXIST("MST-1104", "carrier.code.duplicate"),
    CARRIER_ID_NOT_FOUND("MST-1105", "carrier.id.duplicate"),
    TRIGGER_TYPE_ID_NOT_FOUND("MST-1106", "trigger.type.id.not.found"),
    TRIGGER_TYPE_NAME_ALREADY_EXIST("MST-1107", "trigger.type.name.duplicate"),
    TRIGGER_ID_NOT_FOUND("MST-1108", "trigger.id.not.found"),
    TRIGGER_NAME_ALREADY_EXIST("MST-1109", "trigger.name.duplicate"),
    TRIGGER_CODE_ALREADY_EXIST("MST-1110", "trigger.code.duplicate"),

    PACK_ID_NOT_FOUND("MST-1111", "pack.id.not.found"),
    PACK_CODE_ALREADY_EXIST("MST-1112", "pack.code.already.exist"),
    PACK_NAME_ALREADY_EXIST("MST-1113", "pack.name.already.exist"),
    REFERENCE_TYPE_NAME_ALREADY_EXIST("MST-1114", "reference.type.name.already.exist"),
    REFERENCE_TYPE_SHORTNAME_ALREADY_EXIST("MST-1115", "reference.type.shortname.already.exist"),
    REFERENCE_ID_NOT_EXIST("MST-1116", "reference.id.not.exist"),

    VESSEL_ID_NOT_FOUND("MST-1117", "vessel.id.not.found"),
    VESSEL_NAME_DUPLICATE("MST-1118", "vessel.name.duplicate"),
    VESSEL_SHORT_NAME_DUPLICATE("MST-1119", "vessel.shortname.duplicate"),
    VESSEL_IMO_DUPLICATE("MST-1120", "vessel.imo.duplicate"),
    VESSEL_CALL_SIGN_DUPLICATE("MST-1121", "vessel.call.sign.duplicate"),

    GROUP_ID_NOT_FOUND("MST-1122", "group.id.not.found"),
    GROUP_NAME_ALREADY_EXIST("MST-1123", "group.name.duplicate"),
    GROUP_CODE_ALREADY_EXIST("MST-1124", "group.code.duplicate"),
    AGENT_ID_NOT_FOUND("MST-1125", "agent.id.not.found"),
    AGENT_NAME_ALREADY_EXIST("MST-1126", "agent.name.duplicate"),
    MEMBERSHIP_ID_NOT_FOUND("MST-1127", "membership.id.not.found"),
    MEMBERSHIP_NAME_ALREADY_EXIST("MST-1128", "membership.name.duplicate"),
    MEMBERSHIP_ID_ALREADY_EXIST("MST-1129", "membership.id.duplicate"),

    MEASUREMENT_CALCULATION_TYPE_NOT_NULL("MST-1130", "measurement.calculation.type.not.null"),
    MEASUREMENT_CALCULATION_VALUE_NOT_NULL("MST-1131", "measurement.calculation.value.not.null"),
    MEASUREMENT_DECIMAL_REQUIRED_NOT_NULL("MST-1132", "measurement.decimal.required.not.null"),
    MEASUREMENT_ROUND_OFF_NOT_NULL("MST-1133", "measurement.round.off.not.null"),

    AGENT_ADDRESS_ID_NOT_FOUND("MST-1134", "agent.address.id.not.found"),
    AGENT_ADDRESS_TYPE_PRIMARY_ALREADY_EXIST("MST-1135", "agent.address.primary.duplicate"),
    AGENT_ADDRESS_TYPE_CORPORATE_ALREADY_EXIST("MST-1136", "agent.address.corporate.duplicate"),

    AGENT_CONTACT_ID_NOT_FOUND("MST-1137", "agent.contact.id.not.found"),
    AGENT_CONTACT_NAME_ALREADY_EXIST("MST-1138", "agent.contact.name.duplicate"),
    AGENT_MASTER_TRADE_ID_NOT_EXIST("MST-1139", "agent.master.trade.id.not.exist"),
    AGENT_MASTER_EVENT_EVENT_SERVICE_CITY_ARE_DUPLICATE("MST-1140", "agent.master.event.event.service.city.are.duplicate"),
    AGENT_MASTER_EVENT_ID_NOT_EXIST("MST-1141", "agent.master.event.id.not.exist"),
    AGENT_MASTER_TRADE_TRADE_AND_CITY_ARE_DUPLICATE("MST-1142", "agent.master.trade.trade.and.city.are.duplicate"),
    AGENT_MEMBERSHIP_ID_NOT_FOUND("MST-1143", "agent.membership.id.not.found"),

    CFS_CODE_ALREADY_EXIST("MST-1144", "cfs.code.already.exist"),
    CFS_NAME_ALREADY_EXIST("MST-1145", "cfs.name.already.exist"),
    CFS_ID_NOT_FOUND("MST-1146", "cfs.id.not.found"),
    CANNOT_BE_PRIMARY("MST-1147", "cannot.be.primary"),

    ACCOUNTING_CURRENCY_ID_NOT_EXIST("MST-1148", "accounting.currency.id.not.exist"),
    TRIGGER_TYPE_ALREADY_EXIST("MST-1149", "trigger.type.duplicate"),
    DOCUMENT_TYPE_ID_NOT_FOUND("MST-1150", "document.type.id.not.found"),
    DOCUMENT_TYPE_NAME_ALREADY_EXIST("MST-1151", "document.type.name.duplicate"),
    DOCUMENT_TYPE_SHORT_NAME_ALREADY_EXIST("MST-1152", "document.type.short.name.duplicate"),
    TRIGGER_TYPE_STATUS_INACTIVE("MST-1153", "trigger.type.status.inactive"),
    REASON_ID_NOT_FOUND("MST-1155", "reason.id.not.found"),
    CUSTOMER_MASTER_EMPLOYEE_ID_NOT_EXISTS("MST-1156","customer.master.employee.id.not.exists"),
    CUSTOMER_MASTER_EMPLOYEE_COMBINATION_IS_DUPLICATE("MST-1157","customer.master.employee.combination.is.duplicate"),

    YEAR_MASTER_LINE_ITEM_IS_ALREADY_EXIST("MST-1158", "year.master.line.item.duplicate"),
    CUSTOMER_MASTER_EMPLOYEE_IS_SALESMAN("MST-1159","customer.master.employee.is.salesman"),
    AGENT_MASTER_EMPLOYEE_ID_NOT_EXISTS("MST-1160","agent.master.employee.id.not.exists"),
    AGENT_MASTER_EMPLOYEE_COMBINATION_IS_DUPLICATE("MST-1161","agent.master.employee.combination.is.duplicate"),
    AGENT_MASTER_EMPLOYEE_IS_SALESMAN("MST-1162","agent.master.employee.is.salesman"),
    BUSINESS_ENTITY_ID_NOT_FOUND("MST-1163", "business.entity.id.not.found"),

    QUESTION_ID_NOT_FOUND("MST-1164", "qtionnaireMaster.entity.id.not.found"),
    PRIMARY_SERVICE_NOT_FOUND("MST-1165", "service.code.trade.not.found"),
    RATE_REQUEST_ID_NOT_FOUND("MST-1166", "rate.request.id.not.found"),
    CHARGE_DETAILS_ID_NOT_FOUND("MST-1167", "charge.details.id.not.found"),
    RATE_REQUEST_ALREADY_EXIST("MST-1168", "rate.request.duplicate"),
    CUSTOMER_CONTAIN_ONLY_ONE_PRIMARY_ADDRESS("MST-1169", "customer.should.contain.only.one.primary.address"),
    CUSTOMER_CONTAIN_ONLY_ONE_PRIMARY_CONTACT("MST-1170", "customer.should.contain.only.one.primary.contact"),
    SERVICE_MAPPING_ID_NOT_FOUND("MST-1171", "service.mapping.id.not.found"),
    DUPLICATE_SERVICE_MAPPING_COMBINATION("MST-1172", "duplicate.service.mapping.combination"),
    AGENT_ALREADY_MAPPED_WITH_DIFFERENT_BRANCH("MST-1173", "agent.already.mapped.with.different.branch"),
    NO_EXPORT_SERVICE_MAPPING_FOUND("MST-1174", "no.mapped.export.service.found"),
    ENTITY_NAME_ALREADY_EXIST("MST-1175", "entity.name.already.exist"),
    EXPIRY_DATE_SHOULD_GREATER_THAN_CURRENT_DATE("MST-1176", "expiry.date.should.be.greater.than.current.date"),
    DRIVER_MASTER_ID_NOT_FOUND("MST-1177", "driver.master.id.not.found"),
    DRIVER_MASTER_ATTACHMENT_ID_NOT_FOUND("MST-1178", "driver.master.attachment.id.not.found"),
    EXPIRY_DATE_SHOULD_NOT_NULL_OR_EMPTY("MST-1179", "expiry.date.should.be.not.be.null.or.empty"),
    DRIVER_MOBILE_NUMBER_ALREADY_EXIST("MST-1180", "driver.master.mobilenum.duplicate"),
    DRIVER_NAME_ALREADY_EXIST("MST-1181", "driver.master.name.duplicate"),
    CUSTOMER_ORIGIN_DESTINATION_ID_SHOULD_NOT_SAME("MST-1182","customer.origin.destination.same"),
    NO_IMPORT_SERVICE_MAPPING_FOUND("MST-1183","no.import.service.mapping.found"),
    CUSTOMER_SERVICE_ID_DOES_NOT_EXIST("MST-1184", "no.service.id.found"),
    AGENT_NOT_EXIST_FOR_SELECTED_SERVICE_AND_PORT("MST-1185","agent.not.exist.for.selected.service.and.port");

    public final String CODE;
    public final String KEY;

    ServiceErrors ( String code, String key ) {
        this.CODE = code;
        this.KEY = key;
    }

    public static void validateDuplicates() {

        ServiceErrors[] errorCodes = ServiceErrors.values();
        Set<String> codes = new HashSet<>();
        Set<String> keys = new HashSet<>();

        Set<ServiceErrors> duplicateKeys = Arrays.stream(errorCodes)
                .filter(n -> !codes.add(n.CODE))
                .collect(Collectors.toSet());

        Set<ServiceErrors> duplicateCodes = Arrays.stream(errorCodes)
                .filter(n -> !keys.add(n.KEY))
                .collect(Collectors.toSet());

        if (!CollectionUtils.isEmpty(duplicateKeys) || !CollectionUtils.isEmpty(duplicateCodes)) {
            if (!CollectionUtils.isEmpty(duplicateCodes))
                log.error("Found Duplicate Error Code : {} ", duplicateCodes);
            if (!CollectionUtils.isEmpty(duplicateKeys))
                log.error("Found Duplicate Error Key : {} ", duplicateKeys);
            throw new RuntimeException("Found Duplicate Error Codes");
        }
    }

    public static Set<String> getMessageKeys() {
        return Arrays.stream(ServiceErrors.values())
                .map(n -> n.KEY)
                .collect(Collectors.toSet());
    }

}
