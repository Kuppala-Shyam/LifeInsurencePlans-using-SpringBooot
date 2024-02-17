package com.jsp.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jsp.bank")

public class BankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap=SpringApplication.run(BankApplication.class, args);
	}

}
