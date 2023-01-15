package com.github.nio;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;

public class HttpComponentHttpClient {
    public static void main(String[] args) throws IOException {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        CloseableHttpClient closeableHttpClient = httpClientBuilder
                .build();
        HttpGet request = new HttpGet();
        URI uri = URI.create("http://localhost:8808/");
        request.setURI(uri);

        CloseableHttpResponse response = closeableHttpClient.execute(request);
        String responseStr = EntityUtils.toString(response.getEntity());
        System.out.println(responseStr);
    }


}
