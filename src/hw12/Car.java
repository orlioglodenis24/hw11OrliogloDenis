package hw12;

public class Car extends Transport {
    @Override
    public void go() {
        System.out.println("The car is moving.");
    }

    public void printInfo() {
        System.out.println("This is a Car");
    }
}
