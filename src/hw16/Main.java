package hw16;
//Создать класс Car. Создать в нем поля: mark, age, color, owner. Для поля owner создать класс Owner,
// который будет содержать поля: name, age, expirienceAge (опыт вождения). В главном классе создать 5 объектов класса Car
// Создать ArrayList и использовать методы:
// add(), addAll(), set(), indexOf(), size(), contains(), get(), remove(), lastIndexOf(), isEmpty(), clear() для этих объектов

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Car> cars2 = new ArrayList<>();

        ArrayList<Owner> owners = new ArrayList<>();

        Car car1 = new Car("BMW", 4, "red", "Deonis");
        Car car2 = new Car("Mercedes", 8, "white", "Sergei");
        Car car3 = new Car("Ford", 10, "Black", "Bob");
        Car car4 = new Car("Ford", 11, "White", "Alsu");
        Car car5 = new Car("Mercedes", 6, "Silver", "Dmitrii");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        Owner owner1 = new Owner("John", 35, 15);
        Owner owner2 = new Owner("Alice", 28, 10);
        Owner owner3 = new Owner("Bob", 40, 20);
        Owner owner4 = new Owner("Emma", 45, 25);
        Owner owner5 = new Owner("Michael", 30, 12);

        owners.add(owner1);
        owners.add(owner2);
        owners.add(owner3);
        owners.add(owner4);
        owners.add(owner5);


        cars.addAll(cars2);

        cars.set(3, car5);
        owners.set(3, owner1);

        cars.indexOf("Ford"); //true
        owners.indexOf("Bob"); //true

        cars.size(); // 5
        owners.size(); // 5

        cars.contains(car3); //true
        owners.contains(owner2); //true

        cars.get(4);
        owners.get(3);

        cars.remove(car5);
        owners.remove(owner2);

        cars.lastIndexOf(car2); //1
        owners.lastIndexOf(owner4);

        cars.isEmpty(); //false
        owners.isEmpty(); //false

        cars.clear();
        owners.clear();
    }
}
