package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;




@Controller
public class HomeController {

    private SearchService searchService;

    @Value(value = "${app.title.main}")
    public String title;


    @Autowired
    public HomeController(SearchService searchService) {
        this.searchService = searchService;
    }


    @GetMapping(path = "/")
    public String index(Model model) {
        model.addAttribute("title", title);
        model.addAttribute("search", new Search());
        return "index";
    }

    @GetMapping(path = "/frags")
    public String getFrags(Model model) {
        model.addAttribute("title", title);
        return "frags";
    }

    @PostMapping(path = "/searchForm")
    public String artistSearch(@ModelAttribute("search") Search search, Model model) {

        try {
            searchService.saveSearch(search);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Artist artist = searchArtist(search);
        model.addAttribute("artist", artist);
        model.addAttribute("title", title);
        model.addAttribute("search", search);
        return "result";
    }

    private Artist searchArtist(Search search) {
        Artist artist = new Artist();

            artist = searchService.searchArtist(search.getUserInput());


        if (artist.getName().length() <= 0) artist.setName("Something Went Wrong");
        return artist;
    }

}
