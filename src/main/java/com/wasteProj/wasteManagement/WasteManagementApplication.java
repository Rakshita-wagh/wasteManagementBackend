package com.wasteProj.wasteManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class WasteManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasteManagementApplication.class, args);
	}

	@Configuration
	public static class CorsConfig implements WebMvcConfigurer {
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**")
							.allowedOrigins("http://localhost:3000") // Allow requests from localhost:3000
							.allowedMethods("GET", "POST", "PUT", "DELETE")
							.allowCredentials(true);
				}
			};

		}
	}
}
