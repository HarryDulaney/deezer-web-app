package com.hgdiv.opendata.utils;

import com.sun.jndi.toolkit.url.Uri;
import org.springframework.util.Assert;

import java.net.URI;
import java.net.URISyntaxException;

public class UrlUtils {

    private static final String ARTIST_SEARCH_URL = "https://api.deezer.com/search/artist?q=";
    private static final String BASIC_SEARCH_URL = "https://api.deezer.com/search?q=";


    public static String buildBasicSearchQuery(String userInput) {

        return BASIC_SEARCH_URL + userInput;

    }

    public static URI buildArtistSearchQuery(String userInput) throws URISyntaxException {

        return new URI(ARTIST_SEARCH_URL + userInput);

    }

    public static String buildStrArtistSearchQuery(String artistName) {
        return ARTIST_SEARCH_URL + artistName;
    }
}
