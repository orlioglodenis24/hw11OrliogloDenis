package hw12;

class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        car.printInfo();
        car.calculateDistance(1000);

        System.out.println();

        Truck truck = new Truck();
        truck.go();
        truck.printInfo();
        truck.calculateDistance(300);

        System.out.println();

        Plane airplane = new Plane();
        airplane.go();
        airplane.printInfo();
        airplane.calculateDistance(10000, 3);
    }

}
