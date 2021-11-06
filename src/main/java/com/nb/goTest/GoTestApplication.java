package com.nb.goTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class GoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoTestApplication.class, args);
	}

}
