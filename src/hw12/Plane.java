package hw12;

public class Plane extends Transport {

    private int flightAltitude;

    public Plane(String model, int speed, int flightAltitude) {
        super(model, speed);
        this.flightAltitude = flightAltitude;
    }

    @Override
    public void go() {
        System.out.println("Самолет: " + model + " летит со скоростью " + speed + " , на высоте " + flightAltitude + " метров");
        System.out.println("The plane is flying");
    }

    public void printInfo() {
        System.out.println("This is a Plane");
    }
}