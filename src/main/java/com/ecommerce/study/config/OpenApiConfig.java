package com.ecommerce.study.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("ADONAI")
                        .version("1.0")
                        .description("API interna do site ADONAI.")
                        .contact(new Contact()
                                .name("BackEnd MindyTech")
                                .email("mindyagenciatech@gmail.com")
                                .url("https://mindytech.com.br")))
                .servers(List.of(
                        new Server().url("http://localhost:8090").description("Ambiente de Desenvolvimento")));
    }
}
