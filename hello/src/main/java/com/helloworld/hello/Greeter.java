package com.helloworld.hello;

import org.springframework.stereotype.Component;

@Component("Forwards")
public class Greeter implements Greet{

    /**
     * Passes a String to the class it is injected into
     */
    public String write(){
        return "Hello World!";
    }

}