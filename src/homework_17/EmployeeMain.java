package homework_17;

public class EmployeeMain {


    public static void main(String[] args) {

        System.out.println("1. Создаём два объекта класса Employee при помощи конструктора.\n");
        Employee anton = new Employee("Anton", 27, 2500);
        Employee bertha = new Employee("Bertha", 33, 3000);

        System.out.println("2. Выводим информацию о работниках при помощи метода info().\n");
        anton.info();
        System.out.println();
        bertha.info();

        System.out.println("\n3. Пробуем установить возраст работка Anton в 180 лет.");
        anton.setAge(180);
        System.out.println("Сеттер не даёт этого сделать: " + anton.toString());

        System.out.println("\n3. Увеличиваем зарплату работнику Bertha до 3300 долларов:\n");
        bertha.setSalary(3300);
        bertha.info();
    }

}