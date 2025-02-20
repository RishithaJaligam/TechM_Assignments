package org.anurag.test;

//7. Write a Java program that uses assertions with custom error messages to provide meaningful feedback when a test fails.

import org.anurag.Task07;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task07_Test {
    private final Task07 task7 = new Task07();

    @Test
    public void testAdd() {
        int result = task7.add(3, 4);
        assertEquals("Expected sum of 3 and 4 to be 7", 7, result);
    }

    @Test
    public void testIsPositive() {
        assertTrue("Expected 5 to be positive", task7.isPositive(5));
        assertFalse("Expected -3 to be non-positive", task7.isPositive(-3));
    }
}