package lesson_28;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Ссылки ссылаются на один и тот же объект
        if (!(obj instanceof Employee)) return false; // Проверка на возможность привести к Employee
        Employee employee = (Employee) obj;

        // При таком сравнении возможно появление NPE
        // firstName.equals(employee.firstName);
        // null.equals(employee.firstName); -> аварийное завершение программы
        // Objects.equals(null); -> возврат false

        // При сравнении любого объекта с null должно возвращаться false

        // Безопасное сравнение объектов, учитывая возможность null значений
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth);

    }
}