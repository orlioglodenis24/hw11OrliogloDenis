package hw25;
//Использовать "ленивую" реализацию Singleton и создать класс луна (Moon)
// и реализовать в нем методы getInstance(), whoIsFirstManOnMe(), checkTemperature()
public class Moon {
    private static Moon instance;

    private String  FirstMan;
    private int temperature;

    private Moon(){
        FirstMan="Neil Armstrong";
        temperature=-55;
    }
    public static Moon getInstance(){
        if(instance == null){
            instance=new Moon();
        }
        return instance;
    }
    public String whoIsFirstManOnMe(){
        return FirstMan;
    }
    public String checkTemperature(){
        return  "Средняя температура на луне: "+temperature;
    }

    public static void main(String[] args) {
        Moon moon=Moon.getInstance();
        System.out.println(moon.whoIsFirstManOnMe());
        System.out.println(moon.checkTemperature());
    }
}
