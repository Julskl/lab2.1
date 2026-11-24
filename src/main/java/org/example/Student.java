package org.example;

public class Student extends Person {
    private Stage stage;
    private int year;

    public Student(String name, String surname, Gender gender,
                   String faculty, Stage stage, int year) {
        super(name, surname, gender, faculty);
        this.stage = stage;
        this.year = year;
    }

    @Override
    public void print() {
        printIntroduction("studies");

        String stageName = switch (stage) {
            case BACHELOR -> "Bachelor";
            case MASTER -> "Master";
        };

        String yearText = switch (year) {
            case 1 -> "1st";
            case 2 -> "2nd";
            case 3 -> "3rd";
            default -> year + "th";
        };

        System.out.println(getPronoun() + " is " + yearText
                + " year " + stageName + " student.");
    }
}