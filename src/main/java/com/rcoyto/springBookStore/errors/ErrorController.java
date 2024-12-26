package com.rcoyto.springBookStore.errors;

import com.rcoyto.springBookStore.commons.PageDetail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/error")
public class ErrorController {

    @GetMapping("")
    public String getError(Model model) {

        PageDetail pageDetail = new PageDetail("Error","Error page");

        model.addAttribute("page", pageDetail);

        return "pages/error";
    }

}
