package com.rcoyto.springBookStore.books;

import com.rcoyto.springBookStore.commons.Constants;
import com.rcoyto.springBookStore.commons.PageDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    private String get(Model model, Pageable pageable) {

        pageable = PageRequest.of(pageable.getPageNumber(), Constants.SIZE_PAGE, pageable.getSort());

        Page<Book> responsePage = bookService.getAll(pageable);

        model.addAttribute("responsePage", responsePage);
        model.addAttribute("books", responsePage.getContent());
        model.addAttribute("currentPage", responsePage.getPageable().getPageNumber() + 1);
        model.addAttribute("previousPage", responsePage.getPageable().getPageNumber() - 1);
        model.addAttribute("size", responsePage.getContent().size());
        model.addAttribute("isFirst", responsePage.isFirst());
        model.addAttribute("isLast", responsePage.isLast());
        model.addAttribute("totalPages", responsePage.getTotalPages());

        PageDetail pageDetail = new PageDetail("Books","List of books");
        model.addAttribute("pageDetail", pageDetail);

        return "pages/books/list";
    }

    @GetMapping(path = "/{isbn}")
    private String getById(Model model,  @PathVariable String isbn) {
        model.addAttribute("book", bookService.getById(isbn).orElse(null));
        model.addAttribute("covers", bookService.getCovers());
        model.addAttribute("genres", bookService.getGenres());
        model.addAttribute("publishers", bookService.getPublisher());
        model.addAttribute("languages", bookService.getLanguages());

        if (isbn.equals("0")) {
            return "pages/books/details_new";
        }

        return "pages/books/details_update";
    }

    @PostMapping("/")
    private ResponseEntity<String> add(@ModelAttribute Book book, @RequestParam(name = "pagina-actual", required = false) int paginaActual) {
        bookService.add(book);
        return ResponseEntity.status(HttpStatus.OK).header("HX-Redirect", "/books/?size="+ Constants.SIZE_PAGE + "&page=" + paginaActual).build();
    }

    @PutMapping(path = "/")
    private ResponseEntity<String> update(@RequestBody @ModelAttribute Book book, @RequestParam(name = "pagina-actual", required = false) int paginaActual) {
        bookService.update(book);
        return ResponseEntity.status(HttpStatus.OK).header("HX-Redirect", "/books/?size="+ Constants.SIZE_PAGE + "&page=" + paginaActual).build();
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
