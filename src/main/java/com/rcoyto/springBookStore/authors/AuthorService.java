package com.rcoyto.springBookStore.authors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    Page<Author> getAll(Pageable pageable) {
        return authorRepository.findAll(pageable);
    }

    Author getById(int id) {
        return authorRepository.getReferenceById(id);
    }

    void add(Author author) {
        authorRepository.save(author);
    }

    List<AuthorDataDTO> getAuthorsData() {
        return authorRepository.getAuthorsData();
    }
}
