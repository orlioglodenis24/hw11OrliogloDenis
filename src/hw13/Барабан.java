package hw13;

public class Барабан implements Инструмент{
   String size= "100 см";

    @Override
    public void play() {
        System.out.println("Играет барабан размером "+size);
    }
}
