package com.hgdiv.opendata.service;

import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service("restService")
public class RestServiceImpl implements RESTService {

    private static final Logger log = LoggerFactory.getLogger(RestServiceImpl.class);


    @Override
    public Artist getArtistRequest(String url) throws RestClientException {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        RestTemplate restTemplate = restTemplateBuilder.build();
        Artist artist = restTemplate.getForObject(url,Artist.class);
        assert artist != null;
        return artist;
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
