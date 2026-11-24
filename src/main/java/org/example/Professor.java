package org.example;

public class Professor extends Person {
    private Degree degree;
    private String specialty;

    public Professor(String name, String surname, Gender gender,
                     String faculty, Degree degree, String specialty) {
        super(name, surname, gender, faculty);
        this.degree = degree;
        this.specialty = specialty;
    }

    @Override
    public void print() {
        printIntroduction("teaches");

        String degreeText = switch (degree) {
            case CANDIDATE -> "Candidate of Sciences";
            case DOCTOR -> "Doctor of Sciences";
            case PHD -> "PhD";
            case MSC -> "MSc";
        };

        System.out.println(getPronoun() + " has " + degreeText
                + " degree in " + specialty + ".");
    }
}
