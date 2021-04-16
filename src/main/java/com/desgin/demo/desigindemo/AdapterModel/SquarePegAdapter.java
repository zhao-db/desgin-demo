package com.desgin.demo.desigindemo.AdapterModel;

/**
 * @Description
 * @Author zhaodb
 * @Date 2021/2/23 14:36
 * @Version 1.0
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }

}
