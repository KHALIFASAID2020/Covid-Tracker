package com.covid.tracker.domain.shared.enums;

public enum ResultTest {

    POSITIVE("POSITIVE"),

    NEGATIVE("NEGATIVE");

    private String value;

    ResultTest(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
