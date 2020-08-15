package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.*;
import com.hgdiv.opendata.utils.HttpConnectionUtils;
import com.hgdiv.opendata.utils.SIMHRestTemplate;
import com.hgdiv.opendata.utils.UrlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Search service.
 *
 * @author HGDIV
 */
@Service("searchService")
public class SearchServiceImpl implements SearchService {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    private SIMHRestTemplate restTemplate;

    /**
     * Instantiates a new Search service.
     *
     * @param httpConnectionUtils the http connection utils
     */
    @Autowired
    public SearchServiceImpl(HttpConnectionUtils httpConnectionUtils) {
        this.restTemplate = new SIMHRestTemplate(httpConnectionUtils);

    }


    @Override
    public List<Track> getTopFiveTracks(int artistId) { //TODO: request top 5 tracks
        return null;
    }

    @Override
    public Artists searchArtist(String userInput) throws Exception {
        String urlQuery = UrlUtils.buildArtistSearchQuery(userInput);

        return restTemplate.get(urlQuery, Artists.class);
    }

    @Override
    public Album getAlbumByAlbumId(Integer albumId) throws Exception {
        String url = UrlUtils.buildAlbumDetailURL(albumId);
        return restTemplate.get(url, Album.class);
    }

    @Override
    public Albums getAlbumsByArtistId(Integer artistId) throws Exception {

        String url = UrlUtils.buildAlbumLinkURL(artistId);

        return restTemplate.get(url, Albums.class);
    }


}
