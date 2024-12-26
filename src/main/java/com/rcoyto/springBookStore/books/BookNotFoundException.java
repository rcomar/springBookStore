package com.rcoyto.springBookStore.books;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String isbn) {
        super("Book with ISBN " + isbn + " not found.");
    }
    public BookNotFoundException(){
        super("Book not found");
    }
}
