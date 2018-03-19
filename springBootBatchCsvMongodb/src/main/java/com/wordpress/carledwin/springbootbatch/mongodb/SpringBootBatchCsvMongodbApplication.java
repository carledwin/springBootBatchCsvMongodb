package com.wordpress.carledwin.springbootbatch.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wordpress.carledwin.springbootbatch.mongodb")
public class SpringBootBatchCsvMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBatchCsvMongodbApplication.class, args);
	}
}
