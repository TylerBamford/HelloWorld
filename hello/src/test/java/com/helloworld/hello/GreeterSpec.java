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
public class GreeterSpec{

    Greeter greeter = new Greeter();
    Greeter greeterSpy = Mockito.spy(greeter);

    @Test
    public void testgreeting(){
        String hello = "Hello World!";
        assertTrue("Not Equal", hello.compareTo(greeterSpy.write()) == 0);
        verify(greeterSpy).write();
    }

}