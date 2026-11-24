package org.example;

public abstract class Person {
    private String name;
    private String surname;
    private Gender gender;
    private String faculty;

    protected Person(String name, String surname, Gender gender, String faculty) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.faculty = faculty;
    }

    protected String getPronoun() {
        if (gender == Gender.MAN) {
            return "He";
        }
        return "She";
    }

    protected void printIntroduction(String verb) {
        System.out.println("This is " + name + " " + surname + ". "
                + getPronoun() + " " + verb + " at " + faculty + ".");
    }

    public abstract void print();
}