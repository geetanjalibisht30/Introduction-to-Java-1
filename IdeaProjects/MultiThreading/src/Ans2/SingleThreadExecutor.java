package Ans2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {


    public static void main(String[] args) {

        ExecutorService executorService= Executors.newSingleThreadExecutor();

        Runnable task1=()->
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My task1");
        };

        Runnable task2=()->
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("My task2");
        };
        executorService.submit(task1);
        executorService.submit(task2);
    }
}