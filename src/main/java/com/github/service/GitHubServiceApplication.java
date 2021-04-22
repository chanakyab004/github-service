package com.github.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GitHubServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubServiceApplication.class, args);
	}
}
