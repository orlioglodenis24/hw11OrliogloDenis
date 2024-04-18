package hw14;
//Добавить в свои классы проверку и выкидывать исключения в случае ошибок
//Обработать исключения в try catch

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        try {
            obj.setValue(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}

