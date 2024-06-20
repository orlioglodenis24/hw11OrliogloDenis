package hw26;
//*Создайте класс с двумя методами, один из которых увеличивает значение переменной на 1 (в цикле 5000 раз),
// а другой - уменьшает значение переменной на 1 (в цикле 1000 раз). Оба метода должны использовать synchronized блоки,
// чтобы избежать race condition (проверьте что изначальное значение изменилось на +4000).


public class main {
    int value=0;
    public void IncreaseByOne(){
        synchronized (this){
            for(int i=0;i<5000;i++){
                value++;
                System.out.println(value);
            }
        }
    }
    public void DecreaseByOne(){
        synchronized (this){
            for(int i=0;i<1000;i++){
                value--;
                System.out.println(value);
            }
        }
    }
    public static void main(String[] args) {
        main main=new main();

        Thread increaseByOne=new Thread(()->{
            main.IncreaseByOne();
        });
        Thread decreaseVyOne=new Thread(()->{
            main.DecreaseByOne();
        });
        increaseByOne.start();
        decreaseVyOne.start();

        try{
            increaseByOne.join();
            decreaseVyOne.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(main.value);
    }
}
