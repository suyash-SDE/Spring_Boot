package com.example.SpringBootCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootCoreDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootCoreDemo2Application.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.placeOrder();


	}

//	@Bean
//	public JsonParser getJsonParserBean(){
//		return new BasicJsonParser();
//	}

//	@Bean
//	public UserService getUserServiceBean(){
//		return new UserService();
//	}

}

//@SpringBootApplication
	//@SpringBootConfiguration
	//@EnableAutoConfiguration
	//@ComponentScan


//Beans
//	@Component
//	@Bean
//	@AutoConfiguration



//@ConditionalOnClass()
//@ConditionalOnMissingBean