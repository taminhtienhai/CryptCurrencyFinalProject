package iuh.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Render Fragment
 * @author HaiTMT
 */
@Controller
public class RenderFragment {

    /**
     * Render Send Transaction View
     * @return
     */
    @GetMapping(value = {"/render/view/transactions/send"})
    public String renderSendTransaction() {

        return "user/tab/_send_transaction :: #right-content";
    }

    /**
     * Render Add Transaction View
     * @return
     */
    @GetMapping(value = {"/render/view/transactions/add"})
    public String renderAddTransaction() {

        return "user/tab/_add_transaction :: #main-content";
    }

    /**
     * Render Dashboard Tab Fragment
     * @return
     */
    @GetMapping(value = {"/render/view/tab/dashboard"})
    public String renderDashboardTab() {

        return "user/tab/_dashboard_tab :: #main-content";
    }
}