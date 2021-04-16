package com.desgin.demo.desigindemo.singleton;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 17:14
 * @Version 1.0
 */
public class TaskManager {

    private TaskManager() {

    }

    private static TaskManager taskManager;

    public static TaskManager getInstance() {
        if (taskManager == null) {
            taskManager = new TaskManager();
        }
        return taskManager;
    }

    public void displayProcesses() {
        System.out.println("显示进程");
    }

    public void displayServices() {
        System.out.println("显示服务");
    }

}
