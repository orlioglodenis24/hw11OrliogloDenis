package hw24;

import java.util.*;
import java.util.stream.Collectors;

//Дан список List<Integer> list
//1) Найти среднее значение чисел в списке, используя метод average().
//2) Получить новый список, состоящий из элементов исходного списка, умноженных на заданное число, используя метод map().
//3) Отфильтровать список строк по заданному условию и получить новый список, используя метод filter().
//4) Получить первый элемент списка, удовлетворяющий заданному условию, используя метод findFirst().
//5) Удалить из списка все дубликаты, используя метод distinct().
//6) Получить максимальный элемент списка, используя метод max().
//7) Отсортировать список в обратном порядке, используя метод sorted().
//8) Посчитать количество элементов в списке, удовлетворяющих заданному условию, используя метод count().

public class main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        average.ifPresent(avg -> System.out.println("среднее значение: " + avg));

        int multiplier = 2;
        List<Integer> multipliedList = list.stream().map(x -> x * multiplier).collect(Collectors.toList());
        System.out.println(multipliedList);

        List<String> stringList = List.of("яблоко", "банан", "вишня", "ананас");
        String condition = "а";
        List<String> filteredList = stringList.stream().filter(s -> s.contains(condition)).collect(Collectors.toList());
        System.out.println(filteredList);

        Optional<Integer> firstEven = list.stream().filter(x -> x % 2 == 0).findFirst();
        firstEven.ifPresent(even -> System.out.println("Первое значение: " + even));

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        Optional<Integer> maxElement = list.stream().max(Comparator.naturalOrder());
        maxElement.ifPresent(max -> System.out.println("Max: " + max));

        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        long count = list.stream().filter(x -> x > 2).count();
        System.out.println("кол-во элементов " + count);
    }
}
