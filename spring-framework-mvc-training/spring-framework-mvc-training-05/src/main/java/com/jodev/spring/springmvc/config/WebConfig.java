package com.joaomarcos.spring.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.joaomarcos.spring.springmvc.components.Controller01;

/**This class will be used by the root IOC to get the configuration for each bean under the root IOC management*/
@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages= {"com.joaomarcos.spring.springmvc", "com.joaomarcos.spring.springmvc.controllers"}) 
@EnableWebMvc
public class WebConfig{
	
	//Configuring a Controller bean
	@Bean
	public Controller01 controller01() {
		return new Controller01();
	}
}
