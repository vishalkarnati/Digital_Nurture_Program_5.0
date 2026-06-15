package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2,3));

        assertTrue(10 > 1);

        assertFalse(10 < 5);

        String value = null;
        assertNull(value);

        assertNotNull(calculator);
    }
}