package iuh.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * TransactionController
 * @author HaiTMT
 */
@Controller
public class TransactionController {

    @PostMapping(value = {"/transactions/add"})
    public String addTransactionToBlock() {        

        return "user/frag/_transaction :: .block--transaction";
    }
    
}