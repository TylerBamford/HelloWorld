package com.helloworld.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld{

    @Autowired
    @Qualifier("Backwards")
    private Greet greet;

    /**
     * Prints out the String from the write method of the injected bean
     */
    public void print(){
        System.out.println(greet.write());
    }

}