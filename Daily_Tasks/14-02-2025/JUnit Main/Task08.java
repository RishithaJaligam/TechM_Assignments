package org.anurag;

//8. Write a Java program to explore strategies for testing private methods in a class.

public class Task08 {
    private int square(int num) {
        return num * num;
    }

    public int getSquare(int num) {
        return square(num);
    }
}