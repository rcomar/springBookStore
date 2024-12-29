package com.rcoyto.springBookStore.books;

import com.rcoyto.springBookStore.authors.AuthorService;
import com.rcoyto.springBookStore.commons.PageDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequestMapping(path = "/books")
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping(path = "/")
    private String get(@RequestParam(name = "showDeact", required = false) boolean showDeactivated,Model model, Pageable pageable) {

        Page<Book> responsePage = bookService.getAll(pageable, showDeactivated);
        model.addAttribute("showDeact", showDeactivated);
        model.addAttribute("responsePage", responsePage);
        model.addAttribute("books", responsePage.getContent());

        model.addAttribute(
                "pageDetail",
                new PageDetail("Books","List of books")
        );
        return "pages/books/list";
    }

    @GetMapping(path = "/{isbn}")
    private String getById(Model model,  @PathVariable String isbn) {
        model.addAttribute("book", bookService.getById(isbn).orElse(null));
        model.addAttribute("covers", bookService.getCovers());
        model.addAttribute("genres", bookService.getGenres());
        model.addAttribute("publishers", bookService.getPublisher());
        model.addAttribute("languages", bookService.getLanguages());
        model.addAttribute("authorsData", authorService.getAuthorsData());

        if (isbn.equals("0")) {
            return "pages/books/details_new";
        }
        return "pages/books/details_update";
    }

    @PostMapping("/")
    private ResponseEntity<String> add(@ModelAttribute Book book) {
        bookService.add(book);
        return ResponseEntity.status(HttpStatus.OK).header("HX-Redirect", "/books/").build();
    }

    @PutMapping(path = "/")
    private ResponseEntity<String> update(@RequestBody @ModelAttribute Book book) {
        bookService.update(book);
        return ResponseEntity.status(HttpStatus.OK).header("HX-Redirect", "/books/").build();
    }

    @DeleteMapping(path = "/{isbn}")
    private ResponseEntity<String> delete(@PathVariable String isbn) throws BookNotFoundException {
        bookService.delete(isbn);
        return ResponseEntity.status(HttpStatus.OK).header("HX-Redirect", "/books/").build();
    }

    @GetMapping("/covers")
    private ResponseEntity<Cover[]> getCovers(Model model) {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getCovers());
    }
}
