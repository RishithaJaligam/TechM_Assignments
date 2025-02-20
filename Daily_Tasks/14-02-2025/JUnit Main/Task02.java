package org.anurag;

//2. Write a Java test case to verify that a specific exception is thrown when a method is called with invalid input.

public class Task02 {
    public void validateNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }
}
