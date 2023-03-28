package com.jot.springboot3micrometerobservations;

import io.micrometer.observation.annotation.Observed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot3MicrometerObservationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3MicrometerObservationsApplication.class, args);
	}

}
