package hw12;

class Truck extends Transport{

    protected int cargo;

    public Truck(String model, int speed, int cargo) {
        super(model, speed);
        this.cargo = cargo;
    }

    public void go() {
        System.out.println("Модель Грузовика: " + model + " едет со скоростью: " + speed + " км/час" + ", с грузом: " + cargo + " кг");
    }

}
