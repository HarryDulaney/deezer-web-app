package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.*;
import com.hgdiv.opendata.utils.HttpConnectionUtils;
import com.hgdiv.opendata.utils.SIMHRestTemplate;
import com.hgdiv.opendata.utils.UrlUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.util.List;


@Service("searchService")
public class SearchServiceImpl implements SearchService {

    private static final Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    private SIMHRestTemplate restTemplate;

    @Autowired
    public SearchServiceImpl(HttpConnectionUtils httpConnectionUtils) {
        this.restTemplate = new SIMHRestTemplate(httpConnectionUtils);

    }


    @Override
    public List<Track> getTopFiveTracks(int artistId) {
        return null;
    }

    @Override
    public Artist searchArtist(String userInput) throws RestClientException {
        String urlQuery = UrlUtils.buildArtistSearchQuery(userInput);
        Artists artists = restTemplate.getArtists(urlQuery);
        List<Artist> list = artists.getData();

        return list.get(0);
    }

    @Override
    public Albums getAlbumsByArtist(String artistName) {
        return null;
    }

    @Override
    public Albums getAlbumsByArtistLink(String artistLink) {

        String query = UrlUtils.buildAlbumLinkQuery(artistLink);
        Albums albums = restTemplate.getAlbums(query);


        return null;
    }


}
