package com.os.ionic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;


public class IonicServerDubboProviderMain {

    public static void main(String[] args) throws Exception {
        System.out.println("IonicServer start------" + System.getProperty("spring.profiles.active"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-core.xml");
        context.start();
        System.out.println("IonicServer start------" + System.getProperty("spring.profiles.active"));
        new CountDownLatch(1).await();
    }

}
