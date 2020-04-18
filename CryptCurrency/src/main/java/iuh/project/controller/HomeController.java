package iuh.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = { "/" })
    public String home() {
        return "welcome";
    }

    @GetMapping(value = "")
    public String welcome() {
        return "";
    }

}