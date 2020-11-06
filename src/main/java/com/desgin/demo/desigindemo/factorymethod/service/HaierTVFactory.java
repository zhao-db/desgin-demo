package com.desgin.demo.desigindemo.factorymethod.service;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 14:10
 * @Version 1.0
 */
public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("生产海尔");
        return new HaierTV();
    }
}
