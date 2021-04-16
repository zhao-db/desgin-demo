package com.desgin.demo.desigindemo.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 17:30
 * @Version 1.0
 */
public class LoadBalancer {

    private static LoadBalancer ld = null;

    private List<String> serverList = null;

    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getInstance() {
        if (ld == null) {
            ld = new LoadBalancer();
        }
        return ld;
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void deleteServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return serverList.get(i);

    }


}
