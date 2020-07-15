package designpattern.create.singleton;

import java.util.HashSet;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-07
 */
public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

    public static void main(String args[]) throws InterruptedException {
//        HungrySingleton singleton1 = HungrySingleton.getSingleton();
//        HungrySingleton singleton2 = HungrySingleton.getSingleton();
//        System.out.println(singleton1 == singleton2);
        final HashSet<HungrySingleton> sets = new HashSet<HungrySingleton>();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    sets.add(HungrySingleton.getInstance());
                }
            }).start();
        }

        Thread.sleep(1000);

        for (HungrySingleton singleton : sets) {
            System.out.println(singleton);
        }
    }
}
