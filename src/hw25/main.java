package hw25;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Написать пару примеров Stream API:
//1 Для терминальных операций используя библиотеку Collectors(joining, groupingBy, partitioningBy... )
//2 Для промежуточных операций используем(takeWhile, dropWhile, peek... )

public class main {

    public static void main(String[] args) {

        List<Student> pers = Arrays.asList(
                new Student("Deonis", 20),
                new Student("Olga", 18),
                new Student("Sergey", 14));

        Map<Integer, List<Student>> collectPersAge = pers.stream().collect(Collectors.groupingBy(Student::getAge));
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
        List<Integer> res3 = list.stream().peek(a -> System.out.print(a + " ")).filter(n -> n % 2 !=0).collect(Collectors.toList());
    }
}
