package com.desgin.demo.desigindemo.AdapterModel;

/**
 * @Description
 * @Author zhaodb
 * @Date 2021/2/23 14:34
 * @Version 1.0
 */
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }

}
