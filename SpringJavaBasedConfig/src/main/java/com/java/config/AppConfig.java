package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.bean.Color;
import com.java.bean.InterfaceColor;

@Configuration
public class AppConfig {
	@Bean(name = "myColorBean")
	public InterfaceColor getMyColor() {
		return new Color();
	}
}
