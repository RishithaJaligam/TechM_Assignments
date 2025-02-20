package org.anurag;

//10. Write a Java program that create tests that verify the interaction between different components or modules in your application.

import java.util.HashMap;
import java.util.Map;

public class Task10_Component1 {
    private final Map<Integer, String> dataStore = new HashMap<>();

    public void save(int id, String value) {
        dataStore.put(id, value);
    }

    public String findById(int id) {
        return dataStore.get(id);
    }
}