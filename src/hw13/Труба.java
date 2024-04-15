package hw13;

public class Труба implements Инструмент{
    double diameter=120.13;

    @Override
    public void play() {
        System.out.println("Играет Труба диаметром "+diameter);
    }
}
