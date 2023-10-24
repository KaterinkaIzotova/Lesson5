package com.company.vechicles;
import com.company.details.Engine;
import com.company.professions.Driver;
public class Lorry extends com.company.vechicles.Car {
    int carrying;
    public Lorry(String mark, String class_auto, float weight, Driver driver, Engine motor, int carrying) {
        super(mark, class_auto, weight, driver, motor);
        this.carrying = carrying;
    }
    public int getCarrying() {
        return carrying;
    }
    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
    @Override
    public String toString() {
        String t = "";
        t = "Марка: " + mark + "\n" + "Класс автомобиля: " + class_auto +
                "\n" + "Вес автомобиля: " + weight + "\n" + "Водитель, имя: " + driver.getFullName() + "\n"+
                "Водитель, возраст: " + driver.getAge() + "\n"+ "Водитель, стаж: " + driver.getExperiance() + "\n"+
                "Мотор, сила: " + motor.getPower() + "\n" + "Мотор, компания: " + motor.getCompany() + "\n" + "Грузоподъемность: " + carrying;
        System.out.println(t);
        return t;
    }
}
