package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise2 {

    private static final Logger logger =
            LoggerFactory.getLogger(Exercise2.class);

    public static void main(String[] args) {

        String name = "Vijay";
        int age = 21;
        double marks = 95.75;

        logger.info("Student Name : {}", name);

        logger.info("Student Age : {}", age);

        logger.info("Student Marks : {}", marks);

        logger.info("Student {} scored {} marks.", name, marks);

        logger.debug("Debugging student information.");

    }
}