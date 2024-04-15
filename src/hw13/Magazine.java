package hw13;

public class Magazine implements Printable{

    @Override
    public void print() {

    }
    public static void printMagazines(Printable[] printable){
        System.out.println("название журнала"+ printable);
    };
}
