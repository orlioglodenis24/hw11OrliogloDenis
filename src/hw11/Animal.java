package hw11;

public class Animal {
    class Animall {
        public void main(String[] args) {
            Dog dog = new Dog("Denis");
            Hamster hamster = new Hamster("Drovosek");

            dog.eat();
            dog.drink();
            dog.run();
            dog.jump();
            dog.play();

            hamster.eat();
            hamster.drink();
            hamster.run();
            hamster.jump();
            hamster.sleep();
        }

        int eyes;

        Animall() {
            System.out.println("I am Animal");
        }

        void eat() {
            System.out.println("Animal eats");
        }

        void drink() {
            System.out.println("Animal drinks");
        }
    }

    class Pet extends Animall {
        String name;
        int tail = 1;
        int paw = 4;

        Pet() {
            System.out.println("I am Pet");
            int eyes = 2;
        }

        void run() {
            System.out.println("Pet runs");
        }

        void jump() {
            System.out.println("Pet jumps");
        }
    }

    class Dog extends Pet {

        Dog(String name) {
            System.out.println("I am dog and my name is: " + name);
        }

        void play() {
            System.out.println("Dog plays");
        }
    }

    class Hamster extends Pet {

        Hamster(String name) {
            System.out.println("I am a hamster and my name is: " + name);
        }

        void sleep() {
            System.out.println("Hamster is sleeping");
        }
    }
}
