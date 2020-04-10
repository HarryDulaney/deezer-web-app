package com.hgdiv.opendata.utils;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.hgdiv.opendata.model.Artist;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

public class SIMHRestTemplate {

    private HttpConnectionUtils httpConnectionUtils;

    public SIMHRestTemplate(HttpConnectionUtils httpConnectionUtils) {
        this.httpConnectionUtils = httpConnectionUtils;
    }

    public Artist get(final String url) {
        return getRequest(url);
    }

    private  Artist getRequest(final String requestURL) {

        try {
            final String response = httpConnectionUtils.getConnect(requestURL);
            if (containsError(response)) {
                throw new RestClientException("Error " + response);
            } else {
                return convertJson(httpConnectionUtils.getConnect(requestURL));
            }
        } catch (IOException ex) {
            throw new RestClientException("There is an exception for url " + requestURL, ex);
        }
    }

    private Artist convertJson(final String content) throws IOException {
        Artist artist = new Artist();
        JsonFactory jsonFactory = new JsonFactory();
        JsonParser parser = jsonFactory.createParser(content);

        while (parser.nextToken() != JsonToken.END_OBJECT) {
            String nextToken = parser.getCurrentName();
            if (nextToken.equalsIgnoreCase("id")) {
                parser.nextToken();
                Long id = parser.getLongValue();
                artist.setId(id);
            }
            if (nextToken.equalsIgnoreCase("name")) {
                parser.nextToken();
                String name = parser.getText();
                artist.setName(name);
            }
            if (nextToken.equalsIgnoreCase("link")) {
                parser.nextToken();
                String link = parser.getText();
                artist.setLink(link);
            }
            if (nextToken.equalsIgnoreCase("picture")) {
                parser.nextToken();
                String picture = parser.getText();
                artist.setPicture(picture);
            }
            if (nextToken.equalsIgnoreCase("nb_album")) {
                parser.nextToken();
                Integer nbAlbum = parser.getIntValue();
                artist.setNb_album(nbAlbum);
            }
            if (nextToken.equalsIgnoreCase("nb_fan")) {
                parser.nextToken();
                Integer nbFan = parser.getIntValue();
                artist.setNb_fan(nbFan);
            }
            if (nextToken.equalsIgnoreCase("tracklist")) {
                parser.nextToken();
                String tracklist = parser.getText();
                artist.setTracklist(tracklist);
            }

        }

        return artist;
    }

    private Boolean containsError(final String response) {
        return response.startsWith("{\"error");
    }

}
