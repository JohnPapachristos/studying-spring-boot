package com.sprintBoot.project.studyingspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(final String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(final String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(final String key) {
		this.key = key;
	}
	
	
	
}
