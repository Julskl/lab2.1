package org.example;

public enum Gender {
    MAN("M"),
    WOMAN("F");

    private final String subject;

    Gender(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

}
