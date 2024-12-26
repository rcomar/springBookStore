package com.rcoyto.springBookStore.home;

import com.rcoyto.springBookStore.commons.PageDetail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String home(Model model) {

        PageDetail pageDetail = new PageDetail("Home","Home page");

        model.addAttribute("pageDetail", pageDetail);

        return "pages/home/index";
    }

}
