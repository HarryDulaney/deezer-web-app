package com.hgdiv.opendata.utils;

import com.hgdiv.opendata.model.Search;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlUtils {
    private static final String BASE_URL =  "https://api.deezer.com/artist/";
    private static final String ARTIST_SEARCH_URL = "https://api.deezer.com/search/artist?q=";
    private static final String BASIC_SEARCH_URL = "https://api.deezer.com/search?q=";
    private static final String ALBUMS_LINK_URL = "/albums";

    public static String buildSearchQuery(String userInput) {
        return BASIC_SEARCH_URL + userInput;

    }

    public static String buildArtistSearchQuery(String userInput) {
        return getSearchQuery(userInput,ARTIST_SEARCH_URL);
    }
    public static String buildAlbumLinkQuery(Integer artist_id){
        String urlTail = String.valueOf(artist_id).concat(ALBUMS_LINK_URL);

        return BASE_URL.concat(urlTail);
    }


    private static String getSearchQuery(final String userIn, final String concat) {
        StringBuilder queryBuilder = new StringBuilder(concat);

        try {
            queryBuilder.append(URLEncoder.encode(userIn, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
      /*  if (search.getSearchOrder() != null) {
            queryBuilder.append("&order=");
            queryBuilder.append(search.getSearchOrder());
        }*/
        return queryBuilder.toString();
    }
}
