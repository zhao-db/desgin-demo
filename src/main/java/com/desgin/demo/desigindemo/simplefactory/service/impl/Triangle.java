package com.desgin.demo.desigindemo.simplefactory.service.impl;

import com.desgin.demo.desigindemo.simplefactory.service.Pircture;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/4 17:32
 * @Version 1.0
 */
public class Triangle implements Pircture {
    /**
     * 绘画方法
     */
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    /**
     * 擦除方法
     */
    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
