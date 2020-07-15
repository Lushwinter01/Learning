package javacore.concurrent;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-10
 */
public class LearnLock {
    private Lock lock = new ReentrantLock();

    public  void func() {
        lock.lock();
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String args[]) {
        final LearnLock learnLock = new LearnLock();
        final LearnLock learnLock2 = new LearnLock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->learnLock.func());
        executorService.execute(()->learnLock2.func());

    }
}
