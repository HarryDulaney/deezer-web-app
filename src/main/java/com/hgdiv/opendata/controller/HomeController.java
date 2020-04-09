package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.repository.SearchRepository;
import com.hgdiv.opendata.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class HomeController {

    private SearchRepository searchRepository;
    private SearchService searchService;

    @Value(value = "${app.title.main}")
    public String title;


    @Autowired
    public HomeController(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;

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
        model.addAttribute("artist", searchArtist(search));
        model.addAttribute("title", title);
        model.addAttribute("search", search);
        return "result";
    }

    private Artist searchArtist(Search search) {
        Artist artist = new Artist();
        try {
            artist = searchService.searchArtist(search.getUserInput());

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (artist.getName().length() <= 0) artist.setName("Something Went Wrong");
        return artist;
    }

    @Autowired
    private void searchService(SearchService searchService) {
        this.searchService = searchService;
    }

}
