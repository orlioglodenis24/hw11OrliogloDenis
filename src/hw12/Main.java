package hw12;

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
