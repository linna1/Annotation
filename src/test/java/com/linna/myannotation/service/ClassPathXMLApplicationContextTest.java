package com.linna.myannotation.service;

import com.linna.myannotation.service.ClassPathXMLApplicationContext;
import com.linna.myannotation.service.UserServiceImpl;

public class ClassPathXMLApplicationContextTest {

    public static void main(String[] args) {
        ClassPathXMLApplicationContext path = new ClassPathXMLApplicationContext(
                "configAnnotation.xml");
        UserServiceImpl userService =(UserServiceImpl)path.getBean("userService");
        userService.show();
    }

}