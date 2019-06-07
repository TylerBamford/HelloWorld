package com.helloworld.hello;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreeterTestConfiguration {

    @Bean 
    public HelloWorld helloworld(){
        return new HelloWorld();
    }

    @Bean
    public Greet greet(){
        return Mockito.mock(Greet.class);
    }
}