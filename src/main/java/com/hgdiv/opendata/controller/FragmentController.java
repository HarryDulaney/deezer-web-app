package com.hgdiv.opendata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {

    @GetMapping("/fragments/navigation")
    public String getCoreFrags(Model model) {
        return "fragments/navigation";
    }

    @GetMapping("/fragments/tables")
    public String getTables(Model model) {
        return "fragments/tables";
    }


}
