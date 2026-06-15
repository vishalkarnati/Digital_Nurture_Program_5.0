package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAA_CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up test");

        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up test");
    }

    @Test
    public void testAdd() {

        // Arrange - Prepare data
        int a = 2;
        int b = 3;

        // Act - Execute the method
        int result = calculator.add(a,b);

        // Assert - Verify the result
        assertEquals(5,result);
    }
}