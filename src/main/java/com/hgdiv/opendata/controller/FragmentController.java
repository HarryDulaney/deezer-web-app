package com.hgdiv.opendata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Fragment controller.
 */
@Controller
public class FragmentController {

    /**
     * Gets navigation fragments
     *
     * @param model the model
     * @return the core frags
     */
    @GetMapping("/fragments/navigation")
    public String getCoreFrags(Model model) {
        return "fragments/navigation";
    }



}
