package com.springboot.lardi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lardi3Application {

	public static void main(String[] args) {


		ConfigurableApplicationContext ctx = SpringApplication.run(Lardi3Application.class, args);

		// todo set own custon config ctx.

		ctx.refresh();
	}
}
