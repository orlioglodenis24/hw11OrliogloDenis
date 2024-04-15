package hw13;

public class Book implements Printable {

    @Override
    public void print() {

    }
public static void  printBooks(Printable[] printable){
    for(Printable x:printable){
        if(x instanceof Magazine){
            System.out.println("Название Журнала: "+printable);
        }
    }
}
}
