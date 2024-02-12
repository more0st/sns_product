package com.asher.snsproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SnsproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnsproductApplication.class, args);
	}

}
