package com.hgdiv.opendata.controller;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Albums;
import com.hgdiv.opendata.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class AlbumController {

    Logger log = LoggerFactory.getLogger(AlbumController.class);
    private final SearchService searchService;


    /**
     * The Title.
     */
    @Value(value = "${app.title.main}")
    public String title;

    @Autowired
    public AlbumController(SearchService searchService) {
        this.searchService = searchService;

    }


    @GetMapping("/albums/details/{albumId}")
    public String getSelectedAlbum(@PathVariable("albumId") Integer albumId, Model model) {
        if (albumId == null) {
            return "error-custom";
        } else {

            Album currentAlbum = new Album();
            try {
                currentAlbum = searchService.getAlbumByAlbumId(albumId);
            } catch (Exception e) {
                e.printStackTrace();
            }

            model.addAttribute("currentAlbum", currentAlbum);
            return "album_details";
        }
    }
//
//    @GetMapping("/reloadAlbums")
//    public String albumsReturn(@ModelAttribute("albums") Albums albums, @ModelAttribute("currentArtistId") Integer artistId, Model model) {
//        if (albums == null) {
//            return "error-custom";
//        }
//        final String s = "redirect:/albums/{" + artistId + "}";
//        return s;
//    }

    /**
     * @return all the albums associated with this artist ID
     */
    @GetMapping("/albums/{artistId}")
    public String getAllAlbums(@PathVariable("artistId") Integer artistId, Model model) {
        if (artistId == null) {
            return "error-custom";
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
            throw new Exception("No Albums Found for this Artist");
    }


}