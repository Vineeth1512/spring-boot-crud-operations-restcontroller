package com.example.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.TestBean;

@Configuration
public class ConfigurationAnnotation {
	@Bean
	public TestBean test() {
		return new TestBean();
	}

}
