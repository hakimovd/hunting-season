package com.hakimov.hunting;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.hakimov.hunting")
@PropertySource("classpath:animal.properties")
public class AnimalConfig {
}
