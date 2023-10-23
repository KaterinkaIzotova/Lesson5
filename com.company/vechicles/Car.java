/*
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(),
которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 */
package com.company.vechicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public abstract class Car {
    String mark;
    String class_auto;
    float weight;
    Driver driver;
    Engine motor;

    public Car(String mark, String class_auto, float weight, Driver driver, Engine motor) {
        this.mark = mark;
        this.class_auto = class_auto;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    protected static void start() {
        System.out.println("Поехали");
    }
    protected static void stop() {
        System.out.println("Останавливаемся");
    }
    protected static void turnRight() {
        System.out.println("Поворот направо");
    }
    protected static void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract String toString();

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getClass_auto() {
        return class_auto;
    }

    public void setClass_auto(String class_auto) {
        this.class_auto = class_auto;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }
}
