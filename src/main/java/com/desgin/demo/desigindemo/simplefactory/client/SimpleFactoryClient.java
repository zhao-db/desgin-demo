package com.desgin.demo.desigindemo.simplefactory.client;

import com.desgin.demo.desigindemo.simplefactory.factory.PictureFactory;
import com.desgin.demo.desigindemo.simplefactory.service.Pircture;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/4 17:41
 * @Version 1.0
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        Pircture pircture = PictureFactory.getPirctureByType("4");
        pircture.draw();
        pircture.erase();
    }

}
