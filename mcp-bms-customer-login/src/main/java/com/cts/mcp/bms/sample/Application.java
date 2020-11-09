package com.cts.mcp.bms.sample;
/**
 * 
@author micro-credentional-program
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableAutoConfiguration
@ComponentScan(basePackages = {
		"com.cts.mcp.bms.sample,com.cts.mcp.bms.controller,com.cts.mcp.bms.repository,com.cts.mcp.bms.domain,com.cts.mcp.bms.service" })
@EnableSwagger2
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
