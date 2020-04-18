package iuh.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import iuh.project.model.Wallet;

/**
 * UserController
 * @author HaiTMT
 * @version 1.1
 */
@Controller
public class UserController {

    /**
     * Access to Create Wallet Page
     * @param model
     * @return create wallet HTML
     */
    @GetMapping(value = {"/new/wallet"})
    public String createNewWalletPage(Model model) {
        
        model.addAttribute("wallet", new Wallet());

        return "user/new_wallet";
    }

    /**
     * Access to Dashboard Page
     * @param model
     * @return Dashboard HTML
     */
    @GetMapping(value = {"/welcome/dashboard"})
    public String dashBoardPage(Model model) {

        return "user/dashboard";
    }
    
}