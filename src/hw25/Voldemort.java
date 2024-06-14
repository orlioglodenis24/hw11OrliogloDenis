package hw25;
//Использовать "eager" реализацию Singleton и создать класс  (Voldemort) и
// реализовать в нем методы getInstance(), avadaKedavra(), isAlive()

import java.beans.VetoableChangeListenerProxy;

public class Voldemort {
    private static final Voldemort instance =new Voldemort();

    private boolean alive;

    private Voldemort(){
        alive=true;
    }
    public static Voldemort getInstance(){
        return instance;
    }
    public void avadaKedavra(){
        alive=false;
    }
    public boolean isAlive(){
        return alive;
    }

    public static void main(String[] args) {
        Voldemort voldemort=Voldemort.getInstance();
        System.out.println("-Лорд Во́лан-де-Мо́рт еще жив?");
        System.out.println("-"+voldemort.isAlive());
        voldemort.avadaKedavra();
        System.out.println("-а сейчас жив ли он?");
        System.out.println("-"+ voldemort.isAlive());
    }
}
