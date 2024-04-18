package hw12;

class Truck extends Transport{

    protected int cargo;

    public Truck(String model, int speed, int cargo) {
        super(model, speed);
        this.cargo = cargo;
    }

    @Override
    public void go() {
        System.out.println("Модель Грузовика: " + model + " едет со скоростью: " + speed + " км/час" + ", с грузом: " + cargo + " кг");
        System.out.println("The Truck is moving.");
    }

    public void printInfo() {
        System.out.println("This is a Truck");
    }

}
