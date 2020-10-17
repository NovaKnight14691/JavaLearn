package examples.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class SupplyExample {


    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("red ridinghood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = Arrays.asList(john, tim, jack, snow, red, charming);

        printEmployeeByAge(employees, "Employee over 30", employee -> employee.getAge() > 30);
        printEmployeeByAge(employees, "\nEmployee 30 and under", employee -> employee.getAge() < 30);
        printEmployeeByAge(employees, "\nEmployee younger thant 25 " , new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee){
                return employee.getAge() < 25;
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));

        // Test greaterThan15 first then run lessThan100
        System.out.println(greaterThan15.and(lessThan100).test(50));    
    }

   private static void printEmployeeByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition)
   {
        System.out.println(ageText);
        System.out.println("=================");
        for(Employee employee : employees)
        {
            if(ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
   }
}



