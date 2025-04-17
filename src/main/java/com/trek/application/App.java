package com.trek.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ImportResource("spring.xml")
public class App {
    public static void main(String[] args) {
    	String[] contextPaths = new String[] {"spring.xml"};
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

        LearningFile learn = (LearningFile) factory.getBean("LearningFile");
        learn.hey = 10;
        learn.print();

        LearningFile learn1 = (LearningFile) factory.getBean("LearningFile");
        learn1.print();
    }
}
