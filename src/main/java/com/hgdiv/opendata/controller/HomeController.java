package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Albums;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestClientException;

/**
 * @author HGDIV
 */
@Controller
public class HomeController {

    Logger log = LoggerFactory.getLogger(HomeController.class);

    private SearchService searchService;

    private static Artist currentArtist;

    private static boolean Initialized;

    private static String searchField;

    @Value(value = "${app.title.main}")
    public String title;


    @Autowired
    public HomeController(SearchService searchService) {
        this.searchService = searchService;
    }


    @GetMapping(path = "/")
    public String index(Model model) {
        searchField = null;
        Initialized = false;
        currentArtist = null;
        model.addAttribute("title", title);
        model.addAttribute("artist", new Artist());
        model.addAttribute("search", new Search());
        return "index";
    }

    @GetMapping(path = "/frags")
    public String getFrags(Model model) {
        model.addAttribute("title", title);
        model.addAttribute("currentArtist",currentArtist);
        return "frags";
    }


    @GetMapping(path = "/albums")
    public String getAlbums(Model model) {
        if (!Initialized) {
            return "exception-custom";
        } else {
            Albums albums = null;
            try {
                albums = albumsRequest(currentArtist);
            } catch (Exception e) {
                log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");
                e.printStackTrace();
            }
            log.info("AlbumRequest Artist=" + currentArtist.toString());
            log.info("Albums: " + albums);
            model.addAttribute("title", title);
            assert albums != null;
            model.addAttribute("albums", albums.getData());
            return "albums";
        }
    }


    private Albums albumsRequest(Artist artist) throws Exception {
        Albums albums = null;
        try {
            albums = searchService.getAlbumsByArtistId(artist.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (albums != null)
            return albums;
        else
            throw new Exception();
    }


    @PostMapping(path = "/searchForm")
    public String artistSearch(@ModelAttribute("search") Search search, Model model) {
        setSearchField(search.getUserInput());
        Artist artist = null;
        try {
            artist = searchArtist(search);
        } catch (Exception e) {
            log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");
            e.printStackTrace();
        }
        if (artist == null) {
            return "null_artist_error";
        }
        setCurrentArtist(artist);
        model.addAttribute("artist", artist);
        log.info(currentArtist.toString());
        model.addAttribute("title", title);
        model.addAttribute("search", search);
        return "result";
    }

    private Artist searchArtist(Search search) throws Exception {
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

    public static Artist getCurrentArtist() {
        return currentArtist;
    }

    public static void setCurrentArtist(Artist currentArtist) {
        if (currentArtist != null) {
            Initialized = true;
        }
        HomeController.currentArtist = currentArtist;
    }




}
