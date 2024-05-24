package hw27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    public String name;
    public String department;
    public int salary;

    public Employee(String name, String department, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Denis", "TI232", 2000),
                new Employee("Andrey", "G78", 4000),
                new Employee("Oleg", "Glock12", 1300)
        );

        Map<String, List<Employee>> employeeDepartment = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        double averageSalary = employees
                .stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);

        Map<Boolean, List<Employee>> NewSalary = employees
                .stream()
                .collect(Collectors
                        .partitioningBy(employee -> employee.getSalary() > averageSalary));

        String NewDepartments = employees
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.joining(","));


        System.out.println(NewDepartments);
    }
}
