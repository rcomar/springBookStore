package com.rcoyto.springBookStore.authors;

import com.rcoyto.springBookStore.books.Book;
import com.rcoyto.springBookStore.commons.PageDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/")
    private String getAll(Model model, Pageable pageable) {
        Page<Author> responsePage = authorService.getAll(pageable);

        model.addAttribute("responsePage", responsePage);
        model.addAttribute("authors", responsePage.getContent());
        model.addAttribute(
                "pageDetail",
                new PageDetail("Authors","List of authors")
        );

        return "pages/authors/list";

    }

    @GetMapping("/{id}")
    private String getById(Model model, @PathVariable int id) {
        model.addAttribute("author", authorService.getById(id));

        if (id == 0) {
            return "pages/authors/detail_new";
        }

        return "pages/authors/detail_update";
    }

    @PostMapping("/")
    private ResponseEntity<String> add(@ModelAttribute Author author) {
        authorService.add(author);
        return ResponseEntity.status(HttpStatus.OK).header("HX-Redirect", "/authors/").build();
    }

    @GetMapping("/authorsData")
    private String getAuthorsData(Model model) {
        model.addAttribute("authorsData", authorService.getAuthorsData());
        return "pages/authors/authorsDataList";
    }
}
