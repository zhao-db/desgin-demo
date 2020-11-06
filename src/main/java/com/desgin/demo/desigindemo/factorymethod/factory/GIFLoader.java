package com.desgin.demo.desigindemo.factorymethod.factory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/5 18:41
 * @Version 1.0
 */
public class GIFLoader implements PictureLoader {
    @Override
    public String loaderPicture() {
        System.out.println("读取GIF图片");
        return null;
    }
}
