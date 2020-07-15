package javacore.concurrent.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-04-01
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                System.out.println("线程组任务"+threadNum+"开始");
                countDownLatch.countDown();
                System.out.println("线程组任务"+threadNum+"结束，其他任务继续");
            });
        }
        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();
    }
    public static void test(final int i) {
         try {
             // Thread.sleep(1000);
             System.out.println("run " + i);
         } catch (Exception e) {}
    }
}
