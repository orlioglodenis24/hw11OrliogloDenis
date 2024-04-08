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
