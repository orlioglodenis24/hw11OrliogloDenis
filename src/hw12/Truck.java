package hw12;

public class Truck extends Transport {

    @Override
    public void go() {
        System.out.println("The Truck is moving.");
    }

    public void printInfo() {
        System.out.println("This is a Truck");
    }

}
