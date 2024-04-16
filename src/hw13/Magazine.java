package hw13;

public class Magazine implements Printable {
    static String title = "Агата Кристи";

    public void Title(String title) {
        this.title = title;
    }

    @Override
    public void print() {

    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println("Printing Magazines: " + title);
                printable.print();
            }
        }
    }

    ;
}
