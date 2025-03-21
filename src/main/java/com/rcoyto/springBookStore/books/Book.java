package com.rcoyto.springBookStore.books;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

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

    public Book(String isbn, String title, int pages, Genre genre, Publisher publisher, Language language,
            Cover cover) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
        this.genre = genre;
        this.publisher = publisher;
        this.language = language;
        this.cover = cover;
    }

    public Book() {
    }
}
