package com.example.appclient.configuration;

import com.example.appclient.exception.CustomExceptionDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {
    @Bean
    public CustomExceptionDecoder CustomErrorDecoder(){
        return new CustomExceptionDecoder();
    }
}
