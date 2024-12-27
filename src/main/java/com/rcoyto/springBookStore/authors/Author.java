package com.rcoyto.springBookStore.authors;

import com.rcoyto.springBookStore.books.Book;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private LocalDate birthDate;

    @OneToMany(targetEntity = Book.class,mappedBy = "isbn", orphanRemoval = true)
    List<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Author() {
    }

    public Author(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
}
