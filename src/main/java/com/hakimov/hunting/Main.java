package com.hakimov.hunting;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AnimalConfig.class
        );

        Hunter hunter = context.getBean("hunter", Hunter.class);

        hunter.killAnimal();

        context.close();

    }
}
