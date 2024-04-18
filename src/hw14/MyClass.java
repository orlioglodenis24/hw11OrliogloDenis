package hw14;
//Добавить в свои классы проверку и выкидывать исключения в случае ошибок
//Обработать исключения в try catch

public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int divideBy(int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return this.value / divisor;
    }

    public static void main(String[] args) {
        try {
            MyClass myObject = new MyClass(10);
            int result = myObject.divideBy(0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

