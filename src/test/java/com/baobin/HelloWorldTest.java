package com.baobin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hubaobin on 2017/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"})
public class HelloWorldTest {
    @Autowired
    HelloWorld helloWorld;

    @Test
    public void testSayHello() {
        String result = helloWorld.sayHello();
        Assert.assertEquals("你好", result);
    }
}
