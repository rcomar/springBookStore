package com.rcoyto.springBookStore.books;

public enum Cover{

    PAPERBACK("Paperback"),
    MASS_MARKET("Mass Market Paperback"),
    HARDCOVER("Hardcover");

    private final String type;

    Cover(String type) {
        this.type = type;
    }

    // Getter for the type
    public String getValue() {
        return type;
    }
}
