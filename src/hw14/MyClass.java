package hw14;

public class MyClass {
    private int myValue;

    public void setValue(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Значение не может быть отрицательным");
        }
        this.myValue = value;
    }
}

