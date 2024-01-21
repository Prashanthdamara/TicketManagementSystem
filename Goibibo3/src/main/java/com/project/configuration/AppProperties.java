package com.project.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "restapi")
public class AppProperties {

	public Map<String, String> url = new HashMap<>();

	public Map<String, String> getUrl() {
		return url;
	}

	public void setUrl(Map<String, String> url) {
		this.url = url;
	}

	
	
	
}
