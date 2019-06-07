package com.helloworld.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        HelloWorld hello = context.getBean(HelloWorld.class);
        System.out.println(hello.print());
	}

}
