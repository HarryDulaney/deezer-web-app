package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Albums;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestClientException;


@Controller
public class HomeController {

    Logger log = LoggerFactory.getLogger(HomeController.class);

    private SearchService searchService;

    private Artist currentArtist;

    private static String searchField;

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

    @GetMapping(path = "/albums")
    public String albumRequest(Model model) {
        if (currentArtist != null) {
            Albums albums = albumsRequest(currentArtist);
            log.info("Albums: " + albums.toString());
            model.addAttribute("title", title);
            model.addAttribute("albums", albums);
            return "albums";
        } else {
            return "/error";
        }
    }


    private Albums albumsRequest(Artist artist) {

        return searchService.getAlbumsByArtistLink(artist.getLink());
    }


    @PostMapping(path = "/searchForm")
    public String artistSearch(@ModelAttribute("search") Search search, Model model) {
        setSearchField(search.getUserInput());
        Artist artist = searchArtist(search);
        if (artist == null) {
            return "/error";
        }
        currentArtist = artist;
        model.addAttribute("artist", currentArtist);
        log.info(currentArtist.toString());
        model.addAttribute("title", title);
        model.addAttribute("search", search);
        return "result";
    }

    private Artist searchArtist(Search search) {
        try {
            return searchService.searchArtist(search.getUserInput());

        } catch (RestClientException e) {
            e.printStackTrace();
            log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");

        }

        return new Artist("Something went Wrong, please try searching a different artist");
    }

    public static String getSearchField() {
        return searchField;
    }

    public static void setSearchField(String searchField) {
        HomeController.searchField = searchField;
    }

    public Artist getCurrentArtist() {
        return currentArtist;
    }

    public void setCurrentArtist(Artist currentArtist) {
        this.currentArtist = currentArtist;
    }



}
