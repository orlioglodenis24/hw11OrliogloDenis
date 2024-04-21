package hw15;

//Создайте 2 исключения. Первое будет являтся дочерним классом класса RuntimeException и в нем создайте конструктор,
// который принимает 1 параметр int и передает его в конструктор super класса. Первое исключение называется NotFuelException.
// Второе пусть является дочерним классом класса Exception и называется NotBeltException.
// Также пусть передает параметр String в конструктор super класс.а.

class NotFuelException extends RuntimeException {
    public NotFuelException(int value) {
        super("Нету топлива: " + value);
    }
}

