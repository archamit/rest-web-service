package com.car.insurance.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 *
 */
@Configuration
public class BotConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}