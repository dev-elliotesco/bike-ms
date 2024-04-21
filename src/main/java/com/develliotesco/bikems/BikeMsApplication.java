package com.develliotesco.bikems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BikeMsApplication {

	public static void main(String[] args) {

		SpringApplication.run(BikeMsApplication.class, args);
		final Logger log = LoggerFactory.getLogger(BikeMsApplication.class);
		log.info("Bienvenido a demo de microservicios - bike ms");
	}

}
