package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vechicles.Lorry;
import com.company.vechicles.SportCar;

/*
Создать класс Car в пакете com.company.vehicles,
Engine в пакете com.company.details
и Driver в пакете com.company.professions.
Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(),
которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
Пусть класс Driver расширяет класс Person.
 */
public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("Ivan Ivanov", 14);
        Driver myDriver = new Driver(myPerson.getFullName(), myPerson.getAge(), "4 года");
        Engine myEngine = new Engine("500", "Mini Cooper");
        Lorry myLorry = new Lorry("1","2",3,myDriver,myEngine,6);
        myLorry.toString();

        //   SportCar mySportCar = new SportCar();
        //   mySportCar.toString();
    }
}