package com.myskillslab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot Application class for MySkillsLab
 *
 * MySkillsLab is a skills assessment application that manages multiple-choice questions
 * with support for importing from JSON and tracking user performance.
 */
@SpringBootApplication
public class MySkillsLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySkillsLabApplication.class, args);
    }
}