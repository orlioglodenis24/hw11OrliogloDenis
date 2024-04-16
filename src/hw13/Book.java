package hw13;

public class Book implements Printable {
static String title="Загадки 7 морей";

    public void Title(String title) {
        this.title = title;
    }
    @Override
    public void print() {

    }
public static void  printBooks(Printable[] printables){
    for (Printable printable : printables) {
        if (printable instanceof Book) {
            System.out.println("Printing Books: "+title);
            printable.print();
        }
    }
}
}
