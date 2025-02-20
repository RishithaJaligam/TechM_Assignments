package org.anurag.test;

//3. Write a Java test case that implements a JUnit test with setup and teardown methods to prepare and clean up resources for multiple test cases.

import org.anurag.Task03;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task03_Test {
    private Task03 task3;

    @Before
    public void setUp() {
        task3 = new Task03();
        System.out.println("Setup: Creating Task3 instance");
    }

    @After
    public void tearDown() {
        task3 = null;
        System.out.println("Teardown: Cleaning up resources");
    }

    @Test
    public void testMultiply() {
        assertEquals(20, task3.multiply(4, 5));
    }

    @Test
    public void testIsEven() {
        assertTrue(task3.isEven(8));
        assertFalse(task3.isEven(7));
    }
}