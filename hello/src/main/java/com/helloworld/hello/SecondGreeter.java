package com.helloworld.hello;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class SecondGreeter implements Greet{

    /**
     * Passes a String to the class it is injected into
     */
    public String write(){
        return "!dlroW olleH";
    }

}