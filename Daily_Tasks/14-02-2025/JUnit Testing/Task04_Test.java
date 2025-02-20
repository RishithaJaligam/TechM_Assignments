package org.anurag.test;

//4. Write a Java program that implements parameterized test to verify that a method behaves correctly for different input values.

import org.anurag.Task04;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Task04_Test {
    private final int input;
    private final int expected;
    private final Task04 task4 = new Task04();

    public Task04_Test(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
            {2, 4}, {3, 9}, {4, 16}, {-5, 25}, {0, 0}
        });
    }

    @Test
    public void testSquare() {
        assertEquals(expected, task4.square(input));
    }
}