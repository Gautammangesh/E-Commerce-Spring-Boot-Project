package com.example.SpringBootProject.configuration;

import com.example.SpringBootProject.gateway.api.FakeStoreCategoryApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Value("${application.api.url}")
    private String applicationApiUrl;


    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(applicationApiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }

}
