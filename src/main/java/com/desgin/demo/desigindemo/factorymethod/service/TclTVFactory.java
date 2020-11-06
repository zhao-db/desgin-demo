package com.desgin.demo.desigindemo.factorymethod.service;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 14:11
 * @Version 1.0
 */
public class TclTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("生产TCL");
        return new TclTV();
    }
    
}
