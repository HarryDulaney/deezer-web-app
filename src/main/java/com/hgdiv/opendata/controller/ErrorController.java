package com.hgdiv.opendata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ErrorController {


    @GetMapping("/error")
    public String error(Model model){
        return "unexpected-error";
    }
}
