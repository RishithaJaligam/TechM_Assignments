package org.anurag.test;

//6. Write a Java test case that is intentionally ignored, and explain the scenarios where test skipping might be useful.

import org.anurag.Task06;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class Task06_Test {
    private final Task06 task6 = new Task06();

    @Test
    public void testDivide() {
        assertEquals(2, task6.divide(10, 5));
    }

    @Ignore("Skipping this test because division by zero handling is not implemented yet")
    @Test
    public void testDivideByZero() {
        task6.divide(10, 0);
    }
}