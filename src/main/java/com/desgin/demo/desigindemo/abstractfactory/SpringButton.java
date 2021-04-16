package com.desgin.demo.desigindemo.abstractfactory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 15:55
 * @Version 1.0
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("springButton-----");
    }
}
