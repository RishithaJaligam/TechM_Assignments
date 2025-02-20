package org.anurag;

//6. Write a Java test case that is intentionally ignored, and explain the scenarios where test skipping might be useful.

public class Task06 {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}