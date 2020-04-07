package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.ArtistSearch;
import com.hgdiv.opendata.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class HomeController {

    private final ArtistRepository artistRepository;

    @Value("${app.title.main}")
    public String title;


    @Autowired
    public HomeController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;

    }


    @GetMapping(path = "/")
    public String index(Model model) {
        model.addAttribute("artistSearch",new ArtistSearch());
        model.addAttribute("title",title);
        return "index";
    }

    @PostMapping("/artistForm")
    public String artistSearch(
            @ModelAttribute("artistSearch") ArtistSearch artistSearch,
            Model model) {
        return "result";

    }
}
