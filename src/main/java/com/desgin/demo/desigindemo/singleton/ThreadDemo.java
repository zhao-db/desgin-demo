package com.desgin.demo.desigindemo.singleton;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 18:59
 * @Version 1.0
 */
public class ThreadDemo implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "开始执行");
        Long start = System.currentTimeMillis();
        LazySingleton.getInstance();
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
