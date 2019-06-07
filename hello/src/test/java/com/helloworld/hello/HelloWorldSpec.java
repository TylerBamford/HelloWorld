package com.helloworld.hello;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = GreeterTestConfiguration.class)
public class HelloWorldSpec{

    @Autowired
    private HelloWorld hello;

    @Autowired
    private Greet greet;


    @Test
    public void test(){

        Mockito.when(greet.write()).thenReturn("Write");
        String testWrite = hello.print();
        assertEquals("Write", testWrite);

    }

}