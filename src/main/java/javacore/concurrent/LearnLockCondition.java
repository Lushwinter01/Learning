package javacore.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-11
 */
public class LearnLockCondition {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void before() {
        lock.lock();
        try {
            System.out.println("before");
            condition.signalAll();
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

    public void after() {
        lock.lock();
        try {
            condition.await();
            System.out.println("after");
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }

    public static void main(String args[]) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LearnLockCondition learnLockCondition = new LearnLockCondition();
        executorService.execute(()->learnLockCondition.after());
        executorService.execute(()->learnLockCondition.before());
    }
}
