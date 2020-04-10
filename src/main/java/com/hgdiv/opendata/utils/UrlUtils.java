package com.hgdiv.opendata.utils;

import com.hgdiv.opendata.model.Search;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.util.Assert;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class UrlUtils {

    private static final String ARTIST_SEARCH_URL = "https://api.deezer.com/search/artist?q=";
    private static final String BASIC_SEARCH_URL = "https://api.deezer.com/search?q=";


    public static String buildBasicSearchQuery(String userInput) {

        return BASIC_SEARCH_URL + userInput;

    }

    public static String buildArtistSearchQuery(String userInput)  {

        return ARTIST_SEARCH_URL + userInput;

    }



    private String getSearchQuery(final Search search) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("q=");
        try {
            queryBuilder.append(URLEncoder.encode(search.getUserInput(), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (search.getSearchOrder() != null) {
            queryBuilder.append("&order=");
            queryBuilder.append(search.getSearchOrder());
        }
        return queryBuilder.toString();
    }
}
