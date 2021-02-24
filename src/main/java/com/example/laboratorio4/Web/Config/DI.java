package com.example.laboratorio4.Web.Config;

import com.example.laboratorio4.Services.MoviesService;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    @Bean
    MoviesService createMoviesService() {
        return new MoviesService();
    }

    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }
}