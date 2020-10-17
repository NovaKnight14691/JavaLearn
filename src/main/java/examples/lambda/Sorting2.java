package examples.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting2 {
    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim test", 21);
        Employee jack = new Employee("Jack hill", 40);
        Employee snow = new Employee("snow white", 22);

        List<Employee> employees = Arrays.asList(john, tim, jack, snow);

        Collections.sort(employees, (Employee employee1, Employee employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        employees.forEach((n) -> System.out.println(n));

        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());

        UpperConcat uc = (String s1, String s2) -> s1.toUpperCase() + s2.toUpperCase();
        // Or
        UpperConcat uc2 = (s1, s2) -> s1.toUpperCase() + s1.toUpperCase();

        String sillyString2 = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
    }



    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }

}
