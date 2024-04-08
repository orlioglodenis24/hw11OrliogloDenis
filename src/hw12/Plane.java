package hw12;

public class Plane extends Transport {

    @Override
    public void go() {
        System.out.println("The plane is flying");
    }

    public void printInfo() {
        System.out.println("This is a Plane");
    }

}
