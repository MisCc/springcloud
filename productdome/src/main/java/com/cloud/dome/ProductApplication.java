package com.cloud.dome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication
//@MapperScan("com.cloud.dome.mapper")
public class ProductApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
