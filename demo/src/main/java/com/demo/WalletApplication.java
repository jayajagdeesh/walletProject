package com.walletone.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
public class WalletApplication {

	public static void main(String[] args) {

		SpringApplication.run(WalletApplication.class, args);
	}

}
