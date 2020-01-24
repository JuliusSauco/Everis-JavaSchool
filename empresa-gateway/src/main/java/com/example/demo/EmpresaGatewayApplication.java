package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EmpresaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaGatewayApplication.class, args);
	}

}
