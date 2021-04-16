package com.desgin.demo.desigindemo.singleton;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 18:54
 * @Version 1.0
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                    System.out.println(lazySingleton.toString());
                }
            }
        }
        return lazySingleton;
    }

}
