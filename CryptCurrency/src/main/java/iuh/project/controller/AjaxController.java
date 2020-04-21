package iuh.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * AjaxController
 */
@Controller
public class AjaxController {

    private static int i = 0;
    
    @GetMapping(value = {"/count"})
    public @ResponseBody String getMethodName() {
        i++;
        return String.valueOf(i);
    }

    
    
    
}