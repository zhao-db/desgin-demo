package com.desgin.demo.desigindemo.factorymethod.factory;


/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/5 18:42
 * @Version 1.0
 */
public class JPGLoaderFactory implements PictureLoaderFactory {

    @Override
    public PictureLoader createPictureLoader() {
        return new JPGLoader();
    }

}
