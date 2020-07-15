package javacore.concurrent;
import java.lang.Thread;
import java.util.concurrent.*;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-10
 */
public class LearnThread {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
//        Thread thread = new Thread(new MyRunnable());
//
//        Thread thread1 = new MyThread1();
//
//        thread1.start();
//        thread.start();
        //thread1.interrupt();


//        FutureTask<String> futureTask = new FutureTask<String>(new MyCallable());
//        Thread t3 = new Thread(futureTask);
//        t3.start();
//        System.out.println(futureTask.get());

//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        for (int i = 0; i < 5;i++) {
//            executorService.execute(new MyRunnable());
//        }
//        Future<?> future = executorService.submit(new MyCallable());
//        System.out.println(future.get());
//
//
//        executorService.shutdown();
        MyRunnable runnable1 = new MyRunnable("thread1");
        MyRunnable runnable2 = new MyRunnable("thread2");
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread1.join(6000);

        thread2.start();


    }

}

class MyRunnable implements Runnable {
    Integer a = 0;
    String name = "";
    public MyRunnable(String name){
        this.name = name;
    }
    public void run() {

        synchronized (MyRunnable.class) {
            try {
            Thread.sleep(500);
            } catch (Exception e) {

            }
            a++;
            for(int i =0;i<10;i++) {
                // System.out.println(i);
            }
            System.out.println(name);
        }

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
           while(!interrupted()) {

           }

        System.out.println("Mythread1");
    }
}

class MyCallable implements Callable<String> {

    public String call() throws Exception {
        Thread.sleep(5000);
        return "MyCallable";
    }
}
