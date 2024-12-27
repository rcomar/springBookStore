package com.rcoyto.springBookStore.books;

import com.rcoyto.springBookStore.authors.Author;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "books")
public class Book {

    @Id
    private String isbn;

    private String title;

    private int pages;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Enumerated(EnumType.STRING)
    private Publisher publisher;

    @Enumerated(EnumType.STRING)
    private Language language;

    @Enumerated(EnumType.STRING)
    private Cover cover;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Author.class, optional = false)
    private Author author;

    public Book(String isbn, String title, int pages, Genre genre, Publisher publisher, Language language, Cover cover, Author author, LocalDateTime deactivationDate) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.publisher = publisher;
        this.language = language;
        this.cover = cover;
        this.author = author;
        this.deactivationDate = deactivationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    private LocalDateTime deactivationDate;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public LocalDateTime getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDateTime deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    public Book() {
    }
}
