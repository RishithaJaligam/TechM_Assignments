package org.anurag.test;

//8. Write a Java program to explore strategies for testing private methods in a class.

import org.anurag.Task08;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task08_Test {
    private final Task08 task8 = new Task08();

    @Test
    public void testGetSquare() {
        assertEquals("Expected square of 5 to be 25", 25, task8.getSquare(5));
    }
}