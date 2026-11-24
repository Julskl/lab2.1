package org.example;

public enum Stage {
    BACHELOR("Bachelor"),
    MASTER("Master");

    private final String title;
    Stage(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}