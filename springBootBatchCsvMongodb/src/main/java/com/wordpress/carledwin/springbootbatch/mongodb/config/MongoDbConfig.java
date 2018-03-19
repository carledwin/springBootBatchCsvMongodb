package com.wordpress.carledwin.springbootbatch.mongodb.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;

@Configuration
public class MongoDbConfig {

	@Value("${db.mongo.port}")
	private int mongoDbPort;

	@Value("${db.mongo.url}")
	private String mongoDbUrl;
	
	@Value("${db.mongo.name}")
	private String mongoDbName;
	
	@Bean
	public MongoTemplate mongoTemplate() throws IOException {
		
		EmbeddedMongoFactoryBean embeddedMongoFactoryBean = new EmbeddedMongoFactoryBean();
		embeddedMongoFactoryBean.setBindIp(mongoDbUrl);
		embeddedMongoFactoryBean.setPort(mongoDbPort);
		
		MongoClient mongoClient = embeddedMongoFactoryBean.getObject();
		
		return new MongoTemplate(mongoClient, mongoDbName);
	}
	
}
