package hw15;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", 50);

        try {
            myCar.safetyBelt("Not Belt");
            myCar.drive(0);
        } catch (NotFuelException | NotBeltException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
