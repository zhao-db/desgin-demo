package com.desgin.demo.desigindemo.bulder;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description
 * @Author zhaodb
 * @Date 2021/2/24 11:22
 * @Version 1.0
 */
@Getter
@Setter
public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
          //  this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }
}
