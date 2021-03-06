package com.covid.tracker.domain.shared.enums;

public enum Country {
    TUNISIE("TUNISIE"),

    FRANCE("FRANCE");

    private String value;

    Country(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
