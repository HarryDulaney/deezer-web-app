package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;

@Service("restService")
public class RestServiceImpl implements RESTService {

    private static final Logger log = LoggerFactory.getLogger(RestServiceImpl.class);

    private RestTemplate restTemplate;


    @Autowired
    public RestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Artist getArtistRequest(String url) throws RestClientException {

        Artist artist = restTemplate.getForObject(
                url, Artist.class);
        if (artist != null) {
            log.info(artist.toString());
            return artist;
        }
        return null;
    }


    @Override
    public Album getAlbumRequest(String url) throws RestClientException {
        return null;
    }

    @Override
    public Track getTrackRequest(String url) throws RestClientException {
        return null;
    }

    @Override
    public Search getSearchRequest(String url) throws RestClientException {
        return null;
    }

}
