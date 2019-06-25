package com.liuwq;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class AppOrder {

	/**
	 * http://localhost:9010/orderToMember
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppOrder.class, args);
	}
}