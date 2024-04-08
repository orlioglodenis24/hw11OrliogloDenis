package hw12;

public class Car extends Transport{
    public Car(String model, int speed) {
        super(model, speed);
    }

    public void go() {
        System.out.println("Модель авто: " + model + " и его скорость: " + speed + "км/час");
    }
}
