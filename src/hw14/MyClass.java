package hw14;
//Добавить в свои классы проверку и выкидывать исключения в случае ошибок
//Обработать исключения в try catch

public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int divideBy(int divisor) throws ArithmeticException {
        return this.value / divisor;
    }


}

