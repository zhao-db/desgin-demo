package com.desgin.demo.desigindemo.factorymethod.factory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/5 18:45
 * @Version 1.0
 */
public class GIFLoaderFactory implements PictureLoaderFactory {
    @Override
    public PictureLoader createPictureLoader() {
        return new GIFLoader();
    }
}
