package test.test1;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Students> pers = Arrays.asList(
                new Students("Deonis", 20),
                new Students("Olga", 18),
                new Students("Sergey", 14));

        Map<Integer, List<Students>> collectPersAge = pers.stream().collect(Collectors.groupingBy(Students::getAge));
        collectPersAge.forEach((age, persons2) -> {
            System.out.println("age " + age + ": Name " + persons2);
        });
        System.out.println();
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);

        List<Integer> res1 = list.stream().takeWhile(a -> a <= 11).toList();
        System.out.println("takeWhile(17 elem): " + res1);

        List<Integer> res2 = list.stream().dropWhile(a -> a <= 11).toList();
        System.out.println("dropWhile(17 elem): " + res2);

        System.out.print("peek: ");
        List<Integer> res3 = list.stream().peek(a -> System.out.print(a + " ")).toList();
    }
}

