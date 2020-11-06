package com.desgin.demo.desigindemo.factorymethod.client;

import com.desgin.demo.desigindemo.factorymethod.factory.*;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/5 18:45
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        PictureLoaderFactory factory = null;
        PictureLoader loader = null;
        factory = new PNGLoaderFactory();
        loader = factory.createPictureLoader();
        loader.loaderPicture();
    }

}
