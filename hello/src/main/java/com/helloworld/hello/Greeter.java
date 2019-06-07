package com.helloworld.hello;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Greeter implements Greet{

    /**
     * Passes a String to the class it is injected into
     */
    public String write(){
        return "Hello World!";
    }

}