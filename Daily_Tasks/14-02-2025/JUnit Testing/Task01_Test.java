package org.anurag.test;

//1. Write a Java unit test case to assert that a given method returns the expected value.

import org.anurag.Task01;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task01_Test {  
    @Test
    public void testAddNumbers() {  
        Task01 task1 = new Task01();
        
        assertEquals(8, task1.sum(3, 5));
    }
}