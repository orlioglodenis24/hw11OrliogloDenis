package hw12;

class Main {

    public static void main(String[] args) {
        Car car = new Car("m1", 100);
        car.go();
        car.calculateDistance(1000);
        Truck truck = new Truck("ms10", 120, 2000);
        truck.go();
        truck.calculateDistance(100,3);

        Plane airplane = new Plane("airplane-9000 ", 200, 2000);
        airplane.go();
        airplane.calculateDistance(10000,3);
    }

}
