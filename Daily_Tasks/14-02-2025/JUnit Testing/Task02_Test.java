package org.anurag.test;

//2. Write a Java test case to verify that a specific exception is thrown when a method is called with invalid input.

import org.anurag.Task02;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task02_Test {
    @Test
    public void testValidateNumberThrowsException() {
        Task02 task2 = new Task02();
        try {
            task2.validateNumber(-1);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number must be non-negative", e.getMessage());
        }
    }
}