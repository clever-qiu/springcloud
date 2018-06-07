package com.yangqiu.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@RestController
public class ConfigClientApplication {
	@Value("${from}")
	private static String content;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class,args);
		System.out.println(content);
	}
}
