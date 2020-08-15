package com.hgdiv.opendata.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


/**
 * The type Url utils.
 *
 * @author HGDIV
 */
public class UrlUtils {
    private static final String BASE_URL_ARTIST = "https://api.deezer.com/artist/";
    private static final String ARTIST_SEARCH_URL = "https://api.deezer.com/search/artist?q=";
    private static final String BASIC_SEARCH_URL = "https://api.deezer.com/search?q=";
    private static final String ALBUMS_LINK_URL = "/albums";
    private static final String ALBUM_DETAILS_URL = "/album/";
    private static final String BASE_URL = "https://api.deezer.com";

    /**
     * Build search query string.
     *
     * @param userInput the user input
     * @return the string
     */
    public static String buildSearchQuery(String userInput) {
        return BASIC_SEARCH_URL + userInput;

    }

    /**
     * Build artist search query URL.
     *
     * @param userInput the user input search criteria
     * @return String rep. of URL to use Deezer's search resources
     */
    public static String buildArtistSearchQuery(String userInput) {
        return getSearchQuery(userInput, ARTIST_SEARCH_URL);
    }

    /**
     * Build artistId/albums query link.
     *
     * @param artist_id The Deezer id for the Artist
     * @return String rep. of URL to Artists Albums resources
     */
    public static String buildAlbumLinkURL(Integer artist_id) {
        String urlTail = String.valueOf(artist_id).concat(ALBUMS_LINK_URL);

        return BASE_URL_ARTIST.concat(urlTail);
    }

    /**
     * Build album/albumId URL
     *
     * @param albumId The Deezer id of the Album
     * @return String rep. of URL to Album resources.
     */
    public static String buildAlbumDetailURL(Integer albumId) {
        String endsWith = ALBUM_DETAILS_URL.concat(String.valueOf(albumId));
        return BASE_URL.concat(endsWith);

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
