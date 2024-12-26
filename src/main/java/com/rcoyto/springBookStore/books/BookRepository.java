package com.rcoyto.springBookStore.books;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {

    Page<Book> findByDeactivationDateIsNull(Pageable pageable);

}
