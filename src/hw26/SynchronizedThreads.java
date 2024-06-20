package hw26;
////*Создайте класс с двумя потоками. Каждый поток должен вызывать один и тот же метод,
//// который выводит на консоль квадрат чисел от 1 до 10
////(double x = Math.pow(i, 2);
////System.out.println(x);
////  Смоделируйте поведение вывода по порядку сначала   одного потока, затем второго

public class SynchronizedThreads {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread thread1 = new Thread(new Task(printer));
        Thread thread2 = new Thread(new Task(printer));

        thread1.start();
        thread2.start();
    }
}

class SharedPrinter {
    public synchronized void printSquares() {
        for (int i = 1; i <= 10; i++) {
            double x = Math.pow(i, 2);
            System.out.println(Thread.currentThread().getName() + " - " + x);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task implements Runnable {
    private final SharedPrinter printer;

    public Task(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printSquares();
    }
}
