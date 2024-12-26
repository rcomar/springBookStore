package com.rcoyto.springBookStore.books;

public enum Genre {

    FICTION("Fiction"),
    NON_FICTION("Non fiction"),
    MYSTERY("Mystery"),
    SCIENCE_FICTION("Science fiction"),
    FANTASY("Fantasy"),
    ROMANCE("Romance"),
    HISTORICAL_FICTION("Historical fiction"),
    YOUNG_ADULT("Young adult"),
    TERROR("Terror"),
    HORROR("Horror"),
    BIOGRAPHY("Biography"),
    CLASSIC("Classic"),
    LITERATURE("Literature"),
    CHILDREN("Children"),
    MEMOIR("Memoir"),
    THRILLER("Thriller");

    private final String description;

    // Constructor
    Genre(String description) {
        this.description = description;
    }

    // Getter for the description
    public String getValue() {
        return description;
    }

}
