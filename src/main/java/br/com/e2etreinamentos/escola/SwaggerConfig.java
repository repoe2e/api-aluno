package br.com.e2etreinamentos.escola;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Escola E2E - Cadastro de Alunos")
                        .version("1.0")
                        .description("API para o gerenciamento de alunos na Escola E2E")
                );
    }
}
