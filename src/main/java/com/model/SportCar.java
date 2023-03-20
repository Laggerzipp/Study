package com.model;

import java.math.BigDecimal;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class SportCar extends Vehicle {
    private String maxSpeed;

    public SportCar(String model, Manufacturer manufacturer, BigDecimal price, String maxSpeed, int count) {
        super(model, manufacturer, price, count);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                ", id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
