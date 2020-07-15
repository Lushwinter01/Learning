package designpattern.create.singleton;

import java.util.HashSet;

/**
 * @author Leon Wang (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton =  new LazySingleton();
        }
        return singleton;
    }

    public static void main(String args[]) throws InterruptedException {
//        LazySingleton singleton1 = LazySingleton.getSingleton();
//        LazySingleton singleton2 = LazySingleton.getSingleton();
//        System.out.println(singleton1 == singleton2);

        final HashSet<LazySingleton> sets = new HashSet<LazySingleton>();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    sets.add(LazySingleton.getInstance());
                }
            }).start();
        }

        Thread.sleep(10000);

        for (LazySingleton singleton : sets) {
            System.out.println(singleton);
        }
    }
}
