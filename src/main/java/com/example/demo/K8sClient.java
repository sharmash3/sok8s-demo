package com.example.demo;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class K8sClient {

    @Bean
    public ApiClient getApiClient() throws IOException {
        ApiClient client = Config.defaultClient().setDebugging(true);

        io.kubernetes.client.openapi.Configuration.setDefaultApiClient(client);
        return client;
    }

}
