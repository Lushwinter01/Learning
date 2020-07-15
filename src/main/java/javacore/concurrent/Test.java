package javacore.concurrent;

import java.util.concurrent.*;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-03-18
 */
public class Test {


    public static void main(String args[]) {
        Test testA = new Test();
        Test testB = new Test();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("A");
                    try {
                        testA.wait();
                        testB.notify();
                    } catch (Exception e) {
                    }
                }
            }
        });


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < 4; i++) {
                        System.out.println("B");
                    }
                    try {
                        testA.notify();
                        testB.wait();
                    } catch (Exception e) {
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}