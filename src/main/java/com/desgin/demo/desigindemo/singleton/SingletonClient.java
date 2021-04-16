package com.desgin.demo.desigindemo.singleton;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 17:33
 * @Version 1.0
 */
public class SingletonClient {

    public static void main(String[] args) {
        LoadBalancer ld1, ld2, ld3, ld4;
        ld1 = LoadBalancer.getInstance();
        ld2 = LoadBalancer.getInstance();
        ld3 = LoadBalancer.getInstance();
        ld4 = LoadBalancer.getInstance();

        if (ld1 == ld2 && ld2 == ld3 && ld3 == ld4) {
            System.out.println("唯一性");
        }
        ld1.addServer("server1");
        ld1.addServer("server2");
        ld1.addServer("server3");
        ld1.addServer("server4");
        for (int i = 0; i < 10; i++) {
            String server = ld1.getServer();
            System.out.println("分发:" + server);
        }

    }

}
