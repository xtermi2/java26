package com.github.xtermi2.java26.jep517http3client;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import static org.assertj.core.api.Assertions.assertThat;

class Http3ClientTest {

    @Test
    void get_not_supporting_http3_fallback_to_http2() throws IOException, InterruptedException {
        final HttpResponse<String> response = new Http3Client().get("https://openjdk.org/");

        assertThat(response.statusCode())
                .isEqualTo(200);
        assertThat(response.version())
                .isEqualTo(HttpClient.Version.HTTP_2);
    }

    @Test
    void get_http3() throws IOException, InterruptedException {
        final HttpResponse<String> response = new Http3Client().get("https://http3check.net/");

        assertThat(response.statusCode())
                .isEqualTo(200);
        assertThat(response.version())
                .isEqualTo(HttpClient.Version.HTTP_3);
    }
}