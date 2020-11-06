package com.desgin.demo.desigindemo.factorymethod.factory;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/5 18:48
 * @Version 1.0
 */
public class PNGLoaderFactory implements PictureLoaderFactory {
    @Override
    public PictureLoader createPictureLoader() {
        return new PNGLoader();
    }
}
