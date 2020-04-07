package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    private final ArtistRepository artistRepository;


    @Value("${app.title.main}")
    private String appTitle;

    @Autowired
    public HomeController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;

    }


    @GetMapping(path = "/")
    public String main(Model model) {
        model.addAttribute("app_title", appTitle);
        model.addAttribute("artistForm",new Artist());
        return "index";
    }

    @PostMapping("/artistSearch")
    public String artistResult(
            @ModelAttribute("artistForm")Artist artist) {
        return "result";
    }



}




