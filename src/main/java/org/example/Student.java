package org.example;

public class Student {

    private String name;
    private String surname;
    private Gender gender;
    private String faculty;
    private Stage stage;
    private int year;

    public Student(String name, String surname, Gender gender,
                   String faculty, Stage stage, int year) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.faculty = faculty;
        this.stage = stage;
        this.year = year;
    }

}


