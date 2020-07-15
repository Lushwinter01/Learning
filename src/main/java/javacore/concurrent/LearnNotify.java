package javacore.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-10
 */
public class LearnNotify {

    public synchronized void before() {
        System.out.println("before");
        notify();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (Exception e) {

        }
        System.out.println("after");
    }

    public static void main(String args[]) {
        LearnNotify learnNotify = new LearnNotify();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->learnNotify.after());
        executorService.execute(()->learnNotify.after());
        executorService.execute(()->learnNotify.after());
        executorService.execute(()->learnNotify.before());
        executorService.execute(()->learnNotify.before());
    }

}
