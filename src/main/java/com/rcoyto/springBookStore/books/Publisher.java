package com.rcoyto.springBookStore.books;

public enum Publisher {

    INDEPENDENTLY_PUBLISHED("Independently published"),
    PENGUIN_RANDOM_HOUSE("Penguin Random House"),
    MINOTAURO("Minotauro"),
    DEBOLSILLO("Debolsillo"),
    PLANETA("Planeta"),
    ALFAGUARA("Alfaguara"),
    SALAMANDRA("Salamandra"),
    BOOKET("Booket"),
    CATEDRA("Cátedra"),
    SEIX_BARRAL("Seix Barral"),
    HERDER("Herder"),
    GIGAMESH("Gigamesh"),
    ALMA("Alma");

    private final String publisher;

    Publisher(String type) {
        this.publisher = type;
    }

    // Getter for the type
    public String getValue() {
        return publisher;
    }
}
