package org.example;

public enum Degree {
    CANDIDATE("Candidate of Sciences"),
    DOCTOR("Doctor of Sciences"),
    PHD("PhD"),
    MSC("MSc");

    private final String title;

    Degree(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
