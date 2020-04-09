package com.hgdiv.opendata.service;


import com.hgdiv.opendata.model.Album;
import com.hgdiv.opendata.model.Artist;
import com.hgdiv.opendata.model.Search;
import com.hgdiv.opendata.model.Track;
import org.springframework.web.client.RestClientException;

import java.net.MalformedURLException;

public interface RESTService {

    Artist getArtistRequest(String url) throws RestClientException;

    Album getAlbumRequest(String url) throws RestClientException;

    Track getTrackRequest(String url) throws RestClientException;

    Search getSearchRequest(String url) throws RestClientException;


}
