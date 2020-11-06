package com.desgin.demo.desigindemo.simplefactory.factory;

import com.desgin.demo.desigindemo.simplefactory.service.Pircture;
import com.desgin.demo.desigindemo.simplefactory.service.impl.Circular;
import com.desgin.demo.desigindemo.simplefactory.service.impl.Square;
import com.desgin.demo.desigindemo.simplefactory.service.impl.Triangle;

/**
 * @Description
 * @Author zhaodb
 * @Date 2020/11/4 17:28
 * @Version 1.0
 */
public class PictureFactory {

    public static Pircture getPirctureByType(String type) {

        Pircture pircture = null;
        if (type.equals("1")) {
            pircture = new Circular();
            System.out.println("创建圆形");
        } else if (type.equals("2")) {
            pircture = new Square();
            System.out.println("创建方形");
        } else if (type.equals("3")) {
            pircture = new Triangle();
            System.out.println("创建三角形");
        } else {
            System.out.println("UnSupportedShapeException");
            throw new RuntimeException("UnSupportedShapeException");
        }
        return pircture;

    }


}
