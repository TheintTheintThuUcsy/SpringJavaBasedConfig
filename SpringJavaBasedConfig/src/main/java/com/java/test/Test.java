package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.bean.Color;
import com.java.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Color color = (Color) context.getBean("myColorBean");
		color.printColor();
	}
}
