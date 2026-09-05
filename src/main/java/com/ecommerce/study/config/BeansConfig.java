package com.ecommerce.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
