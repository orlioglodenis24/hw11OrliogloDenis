package hw12;
/*
1) Cоздайте абстрактный класс Transport и переопределите метод printInfo() и go() в трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport

2) В этом классе перегрузите метод calculateDistance(), который может принимать либо сразу дистанцию int dist,
либо принимать (скорость, время) и результат будет dist = v * s
 */
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

    public void calculateDistance(int dist){
        System.out.println("дистанция: "+dist+" км");
    }
    void calculateDistance(int speed, int time) {
        int dist = speed * time;
        System.out.println("скорость: "+speed+", Distance: " +dist);
    }

}
