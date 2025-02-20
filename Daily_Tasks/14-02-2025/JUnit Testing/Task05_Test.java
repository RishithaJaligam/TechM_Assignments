package org.anurag.test;

//5. Write a Java test case that fails if a method takes longer than a specified time to execute.

import org.anurag.Task05;
import org.junit.Test;

public class Task05_Test {
    private final Task05 task5 = new Task05();

    @Test(timeout = 600)
    public void testDelayedMethodTimeout() {
        task5.delayedMethod();
    }
}