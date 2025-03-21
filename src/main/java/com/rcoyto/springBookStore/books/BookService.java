package com.rcoyto.springBookStore.books;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    Optional<Book> getById(String isbn) {
        return bookRepository.findById(isbn);
    }

    Page<Book> getAll(Pageable pageable) {
        return bookRepository.findByDeactivationDateIsNull(pageable);
    }

    void add(Book book) {
        bookRepository.save(book);
    }

    void update(Book book) {
        bookRepository.save(book);
    }

    void delete(String isbn) throws BookNotFoundException {
        Optional<Book> book = bookRepository.findById(isbn);

        if (book.isPresent()) {
            book.get().setDeactivationDate(LocalDateTime.now());
            bookRepository.save(book.get());
            return;
        }

        throw new BookNotFoundException(isbn);
    }

    Cover[] getCovers() {
        return Cover.values();
    }

    Genre[] getGenres() {
        return Genre.values();
    }

    Publisher[] getPublisher() {
        return Publisher.values();
    }

    Language[] getLanguages() {
        return Language.values();
    }
}
