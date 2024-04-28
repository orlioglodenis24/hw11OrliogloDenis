package hw17;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//Создайте коллекцию Set с типом элементов String.
// Добавьте в неё  11 строк: арбуз, банан, вишня, груша, дыня, ежевика, женьшень, земляника, ирис, картофель, арбуз.
// После этого выведем содержимое коллекции на экран, параллельно наблюдая за порядком добавленных.

//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

public class Main {

    public static <T> Set<T> removeDuplicates(Collection<T> collection) {
        return new LinkedHashSet<>(collection);
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

        System.out.print("Элементы в коллекции 'HashSet' : ");
        for (String str : fruitsSet) {
            System.out.print(str + ", ");
        }

        System.out.println();

        System.out.print("Элементы в коллекции без повторений: ");
        Set<String> fruits = removeDuplicates(fruitsSet);
        for (String str : fruits) {
            System.out.print(str + ", ");
        }
    }


}

