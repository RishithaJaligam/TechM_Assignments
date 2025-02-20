package org.anurag;

//5. Write a Java test case that fails if a method takes longer than a specified time to execute.

public class Task05 {
    public void delayedMethod() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}