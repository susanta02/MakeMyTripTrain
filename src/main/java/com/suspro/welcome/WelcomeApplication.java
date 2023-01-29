package com.suspro.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
public class WelcomeApplication {

	@GetMapping("/trains")
	public String getTrains() throws UnknownHostException {
		String ip = InetAddress.getLocalHost().getHostAddress();

		return "Welcome to Train Service "+ip;
	}
	public static void main(String[] args) {
		SpringApplication.run(WelcomeApplication.class, args);
	}

}
