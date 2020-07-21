package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.*;
import com.hgdiv.opendata.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Home controller.
 *
 * @author HGDIV
 */
@Controller
public class HomeController {

    /**
     * The Log.
     */
    Logger log = LoggerFactory.getLogger(HomeController.class);

    private final SearchService searchService;


    /**
     * The Title.
     */
    @Value(value = "${app.title.main}")
    public String title;


    /**
     * Instantiates a new Home controller.
     *
     * @param searchService the search service
     */
    @Autowired
    public HomeController(SearchService searchService) {
        this.searchService = searchService;
    }
    @ModelAttribute("title")
    public String popTitle(){
        return title;
    }

    /**
     * Index string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("initialized", false);
        model.addAttribute("search", new Search());
        return "index";
    }

    /**
     * Artist view string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/artists")
    public String artistSearchResults(Model model) {
        model.addAttribute("search", new Search());
        return "index";
    }


    /**
     * Gets tables.
     *
     * @param model the model
     * @return the tables
     */
    @GetMapping("/fragments/tables")
    public String getTables(Model model) {
        return "fragments/tables";
    }


    /**
     * Gets navigation fragments
     *
     * @param model the model
     * @return the core frags
     */
    @GetMapping("/fragments/navigation")
    public String getCoreFrags(Model model) {
        return "fragments/navigation";
    }

    @GetMapping("/album_details")
    public String populateAlbumDetails(Model model) {
        return "album_details";
    }


    /**
     * Gets albums.
     *
     * @param artistId the artists Deezer id Integer
     * @param model    The model
     * @return the albums
     */
    @GetMapping("/{artistId}")
    public String getAlbums(@PathVariable("artistId") Integer artistId, Model model) {
        if (artistId == null) {
            return "exception-custom";
        } else {
            Albums albums = new Albums();
            try {
                albums = albumsRequest(artistId);
            } catch (Exception e) {
                log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");
                e.printStackTrace();
            }
            model.addAttribute("albums", albums);
            return "albums";
        }
    }

    @GetMapping("/albums")
    public String albumsReturn(@ModelAttribute("albums") Albums albums, Model model) {
        if (albums == null) {
            return "exception-custom";
        }

        model.addAttribute("albums", albums);
        return "albums";
    }


    private Albums albumsRequest(Integer id) throws Exception {
        Albums albums = null;
        try {
            albums = searchService.getAlbumsByArtistId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (albums != null)
            return albums;
        else
            throw new Exception();
    }

    /**
     * Artist search string.
     *
     * @param search the search
     * @param model  the model
     * @return the string
     */
    @PostMapping(path = "/searchForm")
    public String artistSearch(@ModelAttribute("search") Search search, Model model) {

        Artists artistsList = new Artists();
        try {
            artistsList = searchArtist(search);
        } catch (Exception e) {
            log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");
            e.printStackTrace();
        }
        if (artistsList.getData().size() == 0) {
            return "null_artist_error";
        }

        model.addAttribute("artists", artistsList);
        model.addAttribute("initialized", true);
        model.addAttribute("search", search);
        return "index";
    }

    private Artists searchArtist(Search search) throws Exception {
        try {
            return searchService.searchArtist(search.getUserInput());

        } catch (RestClientException e) {
            e.printStackTrace();
            log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");

        }
        List<Artist> list = new ArrayList<>();
        Artists emptyArtists = new Artists();
        emptyArtists.setData(list);
        return emptyArtists;
    }



}