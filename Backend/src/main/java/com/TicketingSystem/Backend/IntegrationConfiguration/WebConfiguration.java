package com.TicketingSystem.Backend.IntegrationConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow all endpoints under /api/ to accept requests from your React frontend (localhost:3000)
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000")  // Allow only the front-end's origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow necessary HTTP methods
                .allowedHeaders("*");  // Allow all headers
    }
}
