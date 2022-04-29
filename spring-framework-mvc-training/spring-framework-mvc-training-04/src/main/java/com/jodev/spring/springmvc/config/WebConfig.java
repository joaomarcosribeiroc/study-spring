package com.joaomarcos.spring.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.joaomarcos.spring.springmvc.components.Controller01;
import com.joaomarcos.spring.springmvc.components.Controller03;
import com.joaomarcos.spring.springmvc.components.ViewResolver01;

/**This class will be used by the root IOC to get the configuration for each bean under the root IOC management*/
@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages= {"com.joaomarcos.spring.springmvc", "com.joaomarcos.spring.springmvc.controllers"}) 
@EnableWebMvc
public class WebConfig{
	
	//Register the ViewResolver implementation bean
	@Bean
	public ViewResolver viewResolver() {
		return new ViewResolver01();
	}
	
	//Configuring a Controller bean
	@Bean
	public Controller01 controller01() {
		return new Controller01();
	}
	
	//Configuring a Controller bean
	@Bean
	public Controller03 controller03() {
		return new Controller03();
	}
}
