package com.covid.tracker.domain.shared.enums;

public enum ResultTest {
    POSITIVE("Positive"),

    NEGATIVE("Negative");

    private String value;

    ResultTest(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
