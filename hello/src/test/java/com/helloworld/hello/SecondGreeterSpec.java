package com.helloworld.hello;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SecondGreeterSpec{

    SecondGreeter secondGreeter = new SecondGreeter();
    SecondGreeter secondGreeterSpy = Mockito.spy(secondGreeter);

    @Test
    public void testWrite(){
        assertTrue(secondGreeterSpy.write().compareTo("!dlroW olleH") == 0);
    }

}