package com.covid.tracker.domain.shared.enums;

public enum VaccinationType {
    JOHNSON("Johnson"),

    MODERNA("MODERNA");

    private String value;

    VaccinationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
