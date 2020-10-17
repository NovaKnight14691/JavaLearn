package examples.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim test",  21);
        Employee jack = new Employee("Jack hill", 40);
        Employee snow = new Employee("snow white", 22);

        List<Employee> employees = Arrays.asList(john, tim, jack, snow);

        // One approach
        Collections.sort(employees, (Employee employee1, Employee employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        employees.forEach((n) -> System.out.println(n));

        // Simpler approach
        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));
    }
}

