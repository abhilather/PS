package com.sapient.training.Week7.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext mobileContext = new ClassPathXmlApplicationContext("mobileContext.xml");
        
        Mobile mobile = (Mobile) mobileContext.getBean("mobile");
//        Mobile mobile = (Mobile).factory.getBean("mobile");
        
//        mobile.mobileSet();
        System.out.println(mobile);
    }
}
