package org.anurag.test;

//9. Write a Java program that tests a singleton class, ensuring it behaves as expected in a multi-threaded environment.

import org.anurag.Task09;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.*;

public class Task09_Test {
    @Test
    public void testSingletonThreadSafety() throws Exception {
        Callable<Task09> task = Task09::getInstance;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Task09> future1 = executor.submit(task);
        Future<Task09> future2 = executor.submit(task);
        Future<Task09> future3 = executor.submit(task);

        Task09 instance1 = future1.get();
        Task09 instance2 = future2.get();
        Task09 instance3 = future3.get();

        executor.shutdown();

        assertSame("All instances should be the same", instance1, instance2);
        assertSame("All instances should be the same", instance2, instance3);
    }
}