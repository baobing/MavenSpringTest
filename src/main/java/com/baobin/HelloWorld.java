package com.baobin;

import org.springframework.stereotype.Component;

/**
 * Created by hubaobin on 2017/3/20.
 */
@Component
public class HelloWorld {
    public  String sayHello() {
        System.out.println("你好");
        return "你好";
    }

    public static void main(String[] args) {
        new HelloWorld().sayHello();
    }
}
