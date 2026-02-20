package com.github.xtermi2.java26.jep517http3client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http3Client {

    public HttpResponse<String> get(String url) throws IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create(url))
                // this is the only change to use HTTP/3, the rest of the code is the same as before
                .version(HttpClient.Version.HTTP_3)
                .GET().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response Version of " + url + ": " + response.version());
        return response;
    }
}
