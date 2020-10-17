package examples.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * The primary purpose for which Function<T, R> has been created is for mapping scenarios
 * i.e when an object of a type is taken as input and it is converted(or mapped) to
 * another type.
 * Common usage of Function is in stream
 * <p>
 * Function<T, R>  T -> R means T is input to the lambda and an object of type R is obtained
 * as return value.
 */
public class FunctionTRExample {
    public static void main(String args[]) {
        //runSimpleExample();
//        runAndThenExample();
        runComposeExample();
    }

    private static void runSimpleExample() {
        // Employee is input
        // String is output
        Function<Employee, String> functionEmpToString = (Employee e) -> {
            return e.getName();
        };
        List<Employee> employeeList = getEmployeeList();
        List<String> empNameList = convertEmpListToNamesList(employeeList, functionEmpToString);

        employeeList.forEach(System.out::println);
    }

    /**
     *  This example runs functionEmpToString first
     *  then run funEmpFirstName
     */
    private static void runComposeExample() {
        // Employee is input
        // String is output
        Function<Employee, String> functionEmpToString = (Employee e) -> {
            return e.getName();
        };
        Function<Employee, Employee> funcEmpFirstName =
                (Employee e) -> {
                    int index = e.getName().indexOf(" ");
                    String firstName = e.getName().substring(0, index);
                    e.setName(firstName);
                    return e;
                };
        List<Employee> employeeList = getEmployeeList();

        List<String> empFirstNameList = convertEmpListToNamesList(employeeList, functionEmpToString.compose(funcEmpFirstName));
        empFirstNameList.forEach(str -> {
            System.out.print("  " + str);
        });
    }

    /**
     * This example run initialFunction function first
     * then run functionEmpToString function
     */
    private static void runAndThenExample() {
        // Employee is input
        // String is output
        Function<Employee, String> functionEmpToString = (Employee e) -> {
            return e.getName();
        };
        List<Employee> employeeList = getEmployeeList();

        Function<String, String> initialFunction = (String s) -> s.substring(0, 1);

        //******** Run initialFunction first then functionEmpToString
        List<String> empNameListInitials = convertEmpListToNamesList(employeeList, functionEmpToString.andThen(initialFunction));
        empNameListInitials.forEach(str -> {
            System.out.println(" " + str);
        });
    }

    private static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> functionEmpToString) {
        List<String> empNameList = new ArrayList<>();
        for (Employee emp : employeeList) {
            empNameList.add(functionEmpToString.apply(emp));
        }
        return empNameList;
    }

    private static List<Employee> getEmployeeList() {
        return Arrays.asList(new Employee("Tom Jones", 45),
                new Employee("Harry Major", 25),
                new Employee("Ethan Hardy", 65),
                new Employee("Nancy Smith", 15),
                new Employee("Deborah Springtly", 29));
    }
}
