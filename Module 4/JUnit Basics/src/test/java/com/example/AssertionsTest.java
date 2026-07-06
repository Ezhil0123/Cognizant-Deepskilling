package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(5, 2 + 3);

        assertTrue(10 > 5);

        assertFalse(5 > 10);

        assertNull(null);

        assertNotNull(new Object());

        assertSame("Hello", "Hello");

        assertNotSame(new Object(), new Object());

        int[] expected = {1,2,3};

        int[] actual = {1,2,3};

        assertArrayEquals(expected, actual);
    }
}