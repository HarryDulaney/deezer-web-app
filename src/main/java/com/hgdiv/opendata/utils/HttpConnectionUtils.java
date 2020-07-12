package com.hgdiv.opendata.utils;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author HGDIV
 */
@Component
public class HttpConnectionUtils implements IHttpConnection{

    Logger log = LoggerFactory.getLogger(HttpConnectionUtils.class);

    private static final String USER_AGENT = "Mozilla/5.0";

    @Override
    public String getConnect(String url) throws IOException {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpGet request = new HttpGet(url);
        request.addHeader("User-Agent",USER_AGENT);
        request.addHeader("Content-Type", "application/json");
        BufferedReader rd;
        CloseableHttpResponse response = client.execute(request);

            rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {

            result.append(line);
        }
        client.close();
        response.close();


        return result.toString();

    }

}
