package hw17;

import java.util.*;
//Создайте коллекцию Set с типом элементов String.
// Добавьте в неё  11 строк: арбуз, банан, вишня, груша, дыня, ежевика, женьшень, земляника, ирис, картофель, арбуз.
// После этого выведем содержимое коллекции на экран, параллельно наблюдая за порядком добавленных.

//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

public class Main {

    public static Collection removeDuplicates(Collection collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("арбуз");
        fruitsSet.add("банан");
        fruitsSet.add("вишня");
        fruitsSet.add("груша");
        fruitsSet.add("дыня");
        fruitsSet.add("ежевика");
        fruitsSet.add("женьшень");
        fruitsSet.add("земляника");
        fruitsSet.add("ирис");
        fruitsSet.add("картофель");
        fruitsSet.add("арбуз");

        System.out.print("Элементы в коллекции : ");
        for (String str : fruitsSet) {
            System.out.print(str + ", ");
        }

        System.out.println();

        System.out.print("Элементы в коллекции без повторений: ");
        Set<String> fruits = (Set<String>) removeDuplicates(fruitsSet);

        for (String str : fruits) {
            System.out.print(str + ", ");
        }
        System.out.println();
        System.out.println();
        HashMap<Integer,String> pass= new HashMap<>();


        pass.put(pass.hashCode(),"Deonis3");
        pass.put(pass.hashCode(),"Sergei");
        pass.put(pass.hashCode(),"Denis");
        System.out.println(pass);

    }
}

