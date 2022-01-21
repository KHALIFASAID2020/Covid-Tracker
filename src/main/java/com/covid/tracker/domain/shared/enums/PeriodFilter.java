package com.covid.tracker.domain.shared.enums;

public enum PeriodFilter {
    DAY("DAY"),
    MONTHLY("MONTHLY"),
    YEAR("YEAR");

    private String value;

    PeriodFilter(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
