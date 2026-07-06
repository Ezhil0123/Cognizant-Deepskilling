package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(15, calculatorService.add(10, 5));
    }
}