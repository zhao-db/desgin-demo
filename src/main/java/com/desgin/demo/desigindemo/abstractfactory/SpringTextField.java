package com.desgin.demo.desigindemo.abstractfactory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 15:59
 * @Version 1.0
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("springTextField-----------");
    }
}
