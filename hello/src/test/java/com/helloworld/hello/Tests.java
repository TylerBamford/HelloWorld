package com.helloworld.hello;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class Tests{

    Greeter greeter = new Greeter();
    SecondGreeter secondGreeter = new SecondGreeter();
    Greeter greeterSpy = Mockito.spy(greeter);
    SecondGreeter secondGreeterSpy = Mockito.spy(secondGreeter);

    @Test
    public void testgreeting(){
        String hello = "Hello World!";
        assertTrue("Not Equal", hello.compareTo(greeterSpy.write()) == 0);
        verify(greeterSpy).write();
    }

    @Test
    public void testSecondGreeter(){
        String helloBack = "!dlroW olleH";
        assertTrue("Not Equal", helloBack.compareTo(secondGreeterSpy.write()) == 0);
    }

}