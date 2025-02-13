package com.internet.herokuapp.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebDriverConfig {
	
	@Bean
	public WebDriver getEdgeDriver() {
		
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
		
	}
	
	@Bean
	public WebDriverWait webDriverWait(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(5));
	}

}
