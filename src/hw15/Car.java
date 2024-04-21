package hw15;
//Создать класс Car. Создать аттрибуты name, color и fuelLevel.
// Первый метод drive будет иметь тип данных void и параметр int. Если данный  параметр равен нулю,
// то пусть выбрасывается исключение NotFuelException. Второй метод safetyBelt пусть принимает
// String и если в строке будет значение "Not Belt", то пусть выбрасывается NotBeltException.
// Если нет, то пусть выводит сообщение "Car is running"

public class Car {
    public String name;
    public String color;
    public int fuelLevel;

    public Car(String name,String color,int fuelLevel){
        this.name=name;
        this.color=color;
        this.fuelLevel=fuelLevel;
    }
    void drive(int level) throws NotFuelException {
        if( level==0){
            throw new NotFuelException(0);
        }else{
            fuelLevel -= level;
            System.out.println();
        }
    }
    public void safetyBelt(String status) throws NotBeltException {
        if (status.equals("Not Belt")) {
            throw new NotBeltException("Safety belt is not fastened");
        } else {
            System.out.println("Car is running");
        }
    }

}



