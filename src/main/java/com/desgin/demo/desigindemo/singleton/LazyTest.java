package com.desgin.demo.desigindemo.singleton;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 18:56
 * @Version 1.0
 */
public class LazyTest {

    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo();
        Thread thread = new Thread(t1, "1");
        ThreadDemo t2 = new ThreadDemo();
        Thread thread1 = new Thread(t2, "2");
        thread.start();
        thread1.start();
        ThreadDemo t3 = new ThreadDemo();
        Thread thread3 = new Thread(t3, "3");
        ThreadDemo t4 = new ThreadDemo();
        Thread thread4 = new Thread(t4, "4");
        thread3.start();
        thread4.start();


    }

}
