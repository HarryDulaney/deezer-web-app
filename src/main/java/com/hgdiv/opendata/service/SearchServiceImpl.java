package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Track;
import com.hgdiv.opendata.utils.HttpConnectionUtils;
import com.hgdiv.opendata.utils.SIMHRestTemplate;
import com.hgdiv.opendata.utils.UrlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("searchService")
public class SearchServiceImpl implements SearchService {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    private SIMHRestTemplate restTemplate;

    public SearchServiceImpl(HttpConnectionUtils httpConnectionUtils){
        this.restTemplate = new SIMHRestTemplate(httpConnectionUtils);

    }


    @Override
    public List<Track> getTopFiveTracks(int artistId) {
        return null;
    }

    @Override
    public Artist searchArtist(String userInput) {
        String urlQuery = UrlUtils.buildArtistSearchQuery(userInput);
        return restTemplate.get(urlQuery);
    }

    @Override
    public List<Album> getAlbumsByArtist(String artistName) {
        return null;
    }



}
