package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Albums;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Artists;
import com.hgdiv.opendata.model.Search;
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
    private static Integer currentArtist;
    private static boolean Initialized;
    private static String searchField;
    private static Artists artists;


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
    private String populateTitle() {
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
        resetView();
        model.addAttribute("artists", artists.getData());
        model.addAttribute("initialized", Initialized);
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
    public String artistView(Model model) {
        model.addAttribute("initialized", Initialized);
        model.addAttribute("artists", artists.getData());
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
        model.addAttribute("artists", artists.getData());
        return "fragments/tables";
    }


    /**
     * Gets albums.
     *
     * @param artistId the artists Deezer id Integer
     * @param model    the model
     * @return the albums
     */
    @GetMapping("/albums/{artistId}")
    public String getAlbums(@PathVariable("artistId") Integer artistId, Model model) {
        if (artistId == null) {
            return "exception-custom";
        } else {
            Albums albums = null;
            try {
                albums = albumsRequest(artistId);
            } catch (Exception e) {
                log.info("Cause: [ " + e.getCause() + " ]  Message: [" + e.getMessage() + " ]");
                e.printStackTrace();
            }
            currentArtist = artistId;
            log.info("AlbumRequest Artist=" + currentArtist.toString());
            log.info("Albums: " + albums);
            assert albums != null;
            model.addAttribute("initialized", Initialized);
            model.addAttribute("albums", albums.getData());
            return "albums";
        }
    }

    @GetMapping("/albums")
    public String albumsReturn(Model model) {
        if (currentArtist == null) {
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

        setSearchField(search.getUserInput());
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
        setArtists(artistsList);
        model.addAttribute("artists", artistsList.getData());
        model.addAttribute("initialized", Initialized);
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

    private static String getSearchField() {
        return searchField;
    }

    private static void setSearchField(String searchField) {
        HomeController.searchField = searchField;
    }

    /**
     * Gets current artist.
     *
     * @return the current artist
     */
    protected static Integer getCurrentArtist() {
        return currentArtist;
    }

    private static void setArtists(Artists artists) {
        if (artists.getData().size() != 0) {
            Initialized = true;
        }
        HomeController.artists = artists;

    }


    private static void resetView() {
        Initialized = false;
        artists = new Artists();
        searchField = null;
    }

}
