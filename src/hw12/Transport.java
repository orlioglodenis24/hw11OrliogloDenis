package hw12;

/*
1) Cоздайте абстрактный класс Transport и переопределите метод printInfo() и go() в трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport

2) В этом классе перегрузите метод calculateDistance(), который может принимать либо сразу дистанцию int dist,
либо принимать (скорость, время) и результат будет dist = v * s
 */
public abstract class Transport {

    public abstract void go();

    public abstract void printInfo();


    public void calculateDistance(int dist) {
        System.out.println("дистанция: " + dist + " км");
    }

    void calculateDistance(int speed, int time) {
        int dist = speed * time;
        System.out.println("скорость: " + speed + ", Distance: " + dist);
    }

}
