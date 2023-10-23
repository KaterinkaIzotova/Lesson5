package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends com.company.vechicles.Car {
    double speed;

    public SportCar(String mark, String class_auto, float weight, Driver driver, Engine motor, double speed) {
        super(mark, class_auto, weight, driver, motor);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString () {
        String t;
        t = "Марка: " + mark + " " + "Класс автомобиля: " + class_auto ;
        System.out.println("t");
        return t;
    }
}
