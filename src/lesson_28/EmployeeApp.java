package lesson_28;

import lists.MyArrayList;
import lists.MyList;

public class EmployeeApp {

    public static void main(String[] args) {

        MyList<Employee> employees = new MyArrayList<>();

        Employee employee = new Employee("Пётр", "Петров", "21.10.2000");
        Employee employee1 = new Employee("Иван", "Иванов", "05.12.1990");
        Employee employee2 = new Employee("Иван", "Иванов", "15.01.2001");
        Employee employee3 = new Employee("Иван", "Иванов", "15.01.2001");

        System.out.println(employee == employee1);
        System.out.println("employee == employee1:  " + (employee2 == employee3));

        System.out.println("employee2.equals(employee):  " + (employee2.equals(employee)));


    }

}

// TODO: попросить показать немного использование регулярных выражений