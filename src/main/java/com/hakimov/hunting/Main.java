package com.hakimov.hunting;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Hunter hunter = context.getBean("hunter", Hunter.class);

        hunter.killAnimal();

        context.close();

    }
}
