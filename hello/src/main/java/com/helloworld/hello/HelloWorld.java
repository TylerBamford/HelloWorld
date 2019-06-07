package com.helloworld.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorld{

    @Autowired
    private Greet greet;

    /**
     * Prints out the String from the write method of the injected bean
     */
    public String print(){
        return greet.write();
    }

}