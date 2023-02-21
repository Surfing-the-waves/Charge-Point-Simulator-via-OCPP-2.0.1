package com.extrawest.ocpp.emulator.chargepoint.cli.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import static com.extrawest.ocpp.emulator.chargepoint.cli.util.EnumUtil.findByField;


/**
 * Charging_ Schedule. Charging_ Rate_ Unit. Charging_ Rate_ Unit_ Code
 * urn:x-oca:ocpp:uid:1:569238
 * The unit of measure Limit is expressed in.
 *
 *
 */
public enum ChargingRateUnitEnum {

    W("W"),
    A("A");
    private final String value;

    ChargingRateUnitEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ChargingRateUnitEnum fromValue(String value) {
        return findByField(
                ChargingRateUnitEnum.class,
                ChargingRateUnitEnum::value,
                value
        );
    }
}
