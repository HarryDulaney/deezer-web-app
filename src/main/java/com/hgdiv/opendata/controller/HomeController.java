package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    private final SearchRepository searchRepository;

    @Value(value = "${app.title.main}")
    public String title;


    @Autowired
    public HomeController(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;

    }


    @GetMapping(path = "/")
    public String index(Model model) {
        model.addAttribute("title", title);
        model.addAttribute("artist", new Artist(""));
        return "index";
    }

    @GetMapping(path="/frags")
    public String getFrags(Model model){
        model.addAttribute("title", title);

        return "frags";
    }

    @PostMapping(path="/artistForm")
    public String artistSearch(
            @ModelAttribute("artistSearch") Search search,
            Model model) {
        model.addAttribute("title", title);
        model.addAttribute("artistSearch", search);
        return "result";
    }
}
