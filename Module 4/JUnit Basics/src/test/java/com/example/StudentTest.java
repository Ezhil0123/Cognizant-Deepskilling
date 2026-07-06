package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {

        student = new Student("Ezhil");

        System.out.println("Setup Completed");
    }

    @After
    public void tearDown() {

        student = null;

        System.out.println("Resources Released");
    }

    @Test
    public void testStudentName() {

        // Arrange
        String expected = "Ezhil";

        // Act
        String actual = student.getName();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testChangeName() {

        // Arrange
        String newName = "John";

        // Act
        student.setName(newName);

        // Assert
        assertEquals(newName, student.getName());
    }
}