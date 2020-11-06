package com.desgin.demo.desigindemo.factorymethod.factory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/5 18:39
 * @Version 1.0
 */
public class JPGLoader implements PictureLoader {
    @Override
    public String loaderPicture() {
        System.out.println("读取JPG图片");
        return null;
    }
}
