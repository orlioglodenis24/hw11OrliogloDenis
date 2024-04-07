package hw12;

public abstract class Transport {

    protected String model;
    protected int speed;

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public abstract void go();

    public void PrintInfo() {
        System.out.println("модель: " + model);
        System.out.println("speed: " + speed);
    }
}

class Car extends Transport {
    public Car(String model, int speed) {
        super(model, speed);
    }

    public void go() {
        System.out.println("Модель авто: " + model + " и его скорость: " + speed + "км/час");
    }
}

class Truck extends Transport {
    protected int cargo;

    public Truck(String model, int speed, int cargo) {
        super(model, speed);
        this.cargo = cargo;
    }

    public void go() {
        System.out.println("Модель Грузовика: " + model + " едет со скоростью: " + speed + " км/час" + ", с грузом: " + cargo + " кг");
    }
}

class Plane extends Transport {
    private int flightAltitude;

    public Plane(String model, int speed, int flightAltitude) {
        super(model, speed);
        this.flightAltitude = flightAltitude;
    }

    @Override
    public void go() {
        System.out.println("Самолет: " + model + " летит со скоростью " + speed + " , на высоте " + flightAltitude + " метров");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("m1", 100);
        car.go();
        Truck truck = new Truck("ms10", 120, 2000);
        truck.go();

        Plane airplane = new Plane("airplane-9000 ", 200, 2000);
        airplane.go();
    }
}

