package com.desgin.demo.desigindemo.builder;

/**
 * @Description
 * @Author zhaodb
 * @Date 2021/2/24 11:17
 * @Version 1.0
 */
public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
