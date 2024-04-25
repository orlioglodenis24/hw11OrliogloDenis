package hw16;

public class Car {
    String mark,color;
    Owner owner;
    int age;

    public Car(String mark,int age,String color,Owner owner){
        this.mark=mark;
        this.age=age;
        this.color=color;
        this.owner=owner;
    }
}
