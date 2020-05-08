package com.hgdiv.opendata.utils;


import com.fasterxml.jackson.databind.*;
import com.hgdiv.opendata.model.Albums;
import com.hgdiv.opendata.model.Artists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

@Component
public class SIMHRestTemplate {
    Logger log = LoggerFactory.getLogger(SIMHRestTemplate.class);

    private IHttpConnection httpConnection;

    public SIMHRestTemplate(IHttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }

    public <T> T get(final String url, Class<T> target) throws Exception {
        return getRequest(url, target);
    }


    private <T> T getRequest(final String url, Class<T> target) throws Exception {

        try {
            final String response = httpConnection.getConnect(url);
            if (containsError(response)) {
                throw new RestClientException("Error " + response);
            } else {


                return convertJson(httpConnection.getConnect(url), target);
            }
        } catch (IOException ex) {
            throw new RestClientException("There is an exception for url " + url, ex);
        }
    }

    private <T> T convertJson(final String content, Class<T> target) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, target);


    }

    private Boolean containsError(final String response) {
        return response.startsWith("{\"error");
    }
}

