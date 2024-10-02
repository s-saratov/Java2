package homework_17;

/*
Task 0

Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
 */

public class Employee {

    // Class fields

    private String name;
    private int age;
    private int salary;

    // Constructors

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) return;
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary < 0 ) return;
        this.salary = salary;
    }

    // Methods

    public String toString() {
        return String.format("Employee %s, age: %d, salary: %d", name, age, salary);
    }

    public void info() {
        System.out.println("Employee info:");
        System.out.println("\t- name:\t\t\t" + name);
        System.out.println("\t- age (y.o.):\t" + age);
        System.out.println("\t- salary (USD):\t" + salary);

    }

}