package org.anurag;

//9. Write a Java program that tests a singleton class, ensuring it behaves as expected in a multi-threaded environment.

public class Task09 {
    private static volatile Task09 instance;

    private Task09() {}

    public static Task09 getInstance() {
        if (instance == null) {
            synchronized (Task09.class) {
                if (instance == null) {
                    instance = new Task09();
                }
            }
        }
        return instance;
    }
}