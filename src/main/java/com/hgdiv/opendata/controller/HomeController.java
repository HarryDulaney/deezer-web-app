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

/**
 * @author HGDIV
 */
@Controller
public class HomeController {

    Logger log = LoggerFactory.getLogger(HomeController.class);

    private final SearchService searchService;
    private static Artist currentArtist;
    private static boolean Initialized;
    private static String searchField;


    @Value(value = "${app.title.main}")
    public String title;


    @Autowired
    public HomeController(SearchService searchService) {
        this.searchService = searchService;
    }

    @ModelAttribute("title")
    private String populateTitle() {
        return title;
    }


    @GetMapping("/")
    public String index(Model model) {
        resetView();
        model.addAttribute("artist", currentArtist);
        model.addAttribute("initialized", Initialized);
        model.addAttribute("search", new Search());
        return "index";
    }

    @GetMapping("/artist")
    public String artistView(Model model) {
        model.addAttribute("initialized", Initialized);
        model.addAttribute("artist", currentArtist);
        model.addAttribute("search",new Search());
        return "index";
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
            assert albums != null;
            model.addAttribute("initialized", Initialized);
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
        model.addAttribute("artist", currentArtist);
        model.addAttribute("initialized", Initialized);
        model.addAttribute("search", search);
        return "index";
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

    private static String getSearchField() {
        return searchField;
    }

    private static void setSearchField(String searchField) {
        HomeController.searchField = searchField;
    }

    protected static Artist getCurrentArtist() {
        return currentArtist;
    }

    protected static void setCurrentArtist(Artist currentArtist) {
        if (currentArtist != null) {
            Initialized = true;
        }
        HomeController.currentArtist = currentArtist;
    }

    private static void resetView() {
        Initialized = false;
        currentArtist = null;
        searchField = null;
    }

}
