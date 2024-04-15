package hw13;

public class main {
    public static void main(String[] args) {
        Printable[] mass = new Printable[]{new Book(),new Magazine()};
        for(Printable x:mass){
             x.print();
        }


        Инструмент[] tools=new Инструмент[]{new Гитара(),new Барабан(),new Труба()};
        for(Инструмент x:tools){
            x.play();
        }
    }
}
