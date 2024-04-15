package hw13;

public class Гитара implements Инструмент{
    int strings=6 ;

    @Override
    public void play() {
        System.out.println("Играет Гитара с " + strings+" струнами");
    }
}
