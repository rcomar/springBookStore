package com.rcoyto.springBookStore.books;

public enum Language {

    SPANISH("Spanish"),
    english("English");

    private final String language;


    Language(String type) {
        this.language = type;
    }

    // Getter for the type
    public String getValue() {
        return language;
    }

}
