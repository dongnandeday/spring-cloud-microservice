package com.lgp.microserviceconfigclienteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceConfigClientEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigClientEurekaApplication.class, args);
	}
}