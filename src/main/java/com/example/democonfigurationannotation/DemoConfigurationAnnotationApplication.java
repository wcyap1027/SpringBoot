package com.example.democonfigurationannotation;

import com.example.democonfigurationannotation.configuration.AppConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoConfigurationAnnotationApplication {

	private static Logger logger = LoggerFactory.getLogger(DemoConfigurationAnnotationApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoConfigurationAnnotationApplication.class, args);
		AppConfiguration appConfiguration = context.getBean(AppConfiguration.class);
		logger.info("Your port number: " +appConfiguration.getServerPort());
		logger.info("Your service URL: " +appConfiguration.getIntegrationServiceUrl());
	}

}
