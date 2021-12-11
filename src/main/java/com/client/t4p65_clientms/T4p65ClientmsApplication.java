package com.client.t4p65_clientms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class T4p65ClientmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(T4p65ClientmsApplication.class, args);
                
	}

}
