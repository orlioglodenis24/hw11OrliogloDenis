package hw16;
//Создать класс Car. Создать в нем поля: mark, age, color, owner. Для поля owner создать класс Owner,
// который будет содержать поля: name, age, expirienceAge (опыт вождения). В главном классе создать 5 объектов класса Car
// Создать ArrayList и использовать методы:
// add(), addAll(), set(), indexOf(), size(), contains(), get(), remove(), lastIndexOf(), isEmpty(), clear() для этих объектов

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList cars2 = new ArrayList<>();

        ArrayList owners = new ArrayList<>();


        cars.add(new Car("BMW", 4, "red", new Owner("Deonis",20,4)));
        cars.add(new Car("Mercedes", 8, "white", new Owner("Sergii",17,2)));
        cars.add(new Car("Ford", 10, "Black", new Owner("Anea",19,3)));
        cars.add(new Car("Ford", 11, "White", new Owner("Irina",18,5)));
        cars.add(new Car("Mercedes", 6, "Silver", new Owner("Alsu",23,4)));

        owners.add(new Owner("John", 35, 15));
        owners.add(new Owner("Alice", 28, 10));
        owners.add(new Owner("Bob", 40, 20));
        owners.add(new Owner("Emma", 45, 25));
        owners.add(new Owner("Michael", 30, 12));


        cars.addAll(cars2);

        cars.set(3, cars.get(1));
        owners.set(3, owners.get(1));
        System.out.println( cars.set(3, cars.get(1)));
        System.out.println(owners.set(3, owners.get(1)));

        cars.indexOf("Ford");
        System.out.println(cars.indexOf("Ford"));//true

        owners.indexOf("Bob"); //true
        System.out.println(owners.indexOf("Bob"));

        cars.size(); // 5
        owners.size(); // 5
        System.out.println(cars.size());
        System.out.println(owners.size());

        cars.contains(cars.get(1)); //true
        owners.contains(owners.get(2)); //true
        System.out.println(cars.contains(cars.get(3)));
        System.out.println( owners.contains(owners.get(3)));

        cars.get(4);
        owners.get(3);
        System.out.println(cars.get(4));
        System.out.println(owners.get(3));

        cars.remove(cars.get(1));
        owners.remove(owners.get(4));
        System.out.println(cars.remove(cars.get(1)));
        System.out.println(owners.remove(owners.get(4)));

        cars.lastIndexOf(cars.get(2)); //1
        owners.lastIndexOf(owners.get(4));
        System.out.println(cars.lastIndexOf(cars.get(2)));
        System.out.println(owners.lastIndexOf(owners.get(4)));

        cars.isEmpty();//false
        owners.isEmpty(); //false
        System.out.println(cars.isEmpty());
        System.out.println(owners.isEmpty());

        cars.clear();
        owners.clear();
    }
}
