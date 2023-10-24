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
        t = "Марка: " + mark + "\n" + "Класс автомобиля: " + class_auto +
                "\n" + "Вес автомобиля: " + weight + "\n" + "Водитель, имя: " + driver.getFullName() + "\n"+
                "Водитель, возраст: " + driver.getAge() + "\n"+ "Водитель, стаж: " + driver.getExperiance() + "\n"+
                "Мотор, сила: " + motor.getPower() + "\n" + "Мотор, компания: " + motor.getCompany() +  "\n" + "Скорость: " + speed;

        System.out.println(t);
        return t;
    }
}
