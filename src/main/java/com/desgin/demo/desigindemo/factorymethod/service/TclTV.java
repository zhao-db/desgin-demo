package com.desgin.demo.desigindemo.factorymethod.service;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/6 14:09
 * @Version 1.0
 */
public class TclTV implements TV {
    @Override
    public void play() {
        System.out.println("播放tcl");
    }
}
