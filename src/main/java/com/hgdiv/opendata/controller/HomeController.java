package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.*;
import com.hgdiv.opendata.service.APIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;

/**
 * The View controller.
 *
 * @author HGDIV
 */
@Controller
public class HomeController {

    /**
     * The Console Logger.
     */
    Logger log = LoggerFactory.getLogger(HomeController.class);

    private final APIService APIService;


    /**
     * The Title.
     */
    @Value(value = "${app.title.main}")
    public String title;


    /**
     * Instantiates a new Home controller.
     *
     * @param APIService the search service
     */
    @Autowired
    public HomeController(APIService APIService) {
        this.APIService = APIService;
    }

    @ModelAttribute("title")
    public String popTitle() {
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
            return APIService.searchArtist(search.getUserInput());

        } catch (RestClientException e) {
            e.printStackTrace();
            log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");

        }
        throw new Exception("Something un-expected went wrong during the Artist Search");
    }
}