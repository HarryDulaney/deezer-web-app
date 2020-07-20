package com.hgdiv.opendata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Error controller.
 */
@Controller
public class ErrorController {


    /**
     * Error string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/error")
    public String error(Model model){
        return "error";
    }
}
