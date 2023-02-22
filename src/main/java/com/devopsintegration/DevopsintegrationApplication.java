package com.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsintegrationApplication {

	@GetMapping
	public String message(){
		return "Welcome Mohammad to DevOps Integration with Jenkins and Docker and Kubernetes";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsintegrationApplication.class, args);
	}

}
