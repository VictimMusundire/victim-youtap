package com.victim.victimtapapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class VictimTapApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VictimTapApiApplication.class, args);
	}

}
