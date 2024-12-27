package com.rcoyto.springBookStore.authors;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("SELECT a from authors a")
    List<AuthorDataDTO> getAuthorsData();
}
