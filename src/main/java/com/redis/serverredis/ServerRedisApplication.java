package com.redis.serverredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheConfig;

@SpringBootApplication
@CacheConfig
public class ServerRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRedisApplication.class, args);
	}
}
