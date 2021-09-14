package it.vscalcione.springboot.demoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("it.vscalcione.springboot.demoapplication.model")
@ComponentScan("it.vscalcione.springboot.demoapplication.dao")
@ComponentScan("it.vscalcione.springboot.demoapplication.service")
@ComponentScan("it.vscalcione.springboot.demoapplication.controller")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
