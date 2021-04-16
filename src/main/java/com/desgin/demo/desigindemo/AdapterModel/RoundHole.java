package com.desgin.demo.desigindemo.AdapterModel;

/**
 * @Description
 * @Author zhaodb
 * @Date 2021/2/23 14:29
 * @Version 1.0
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }

}
