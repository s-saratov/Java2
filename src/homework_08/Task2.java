package homework_08;

/*
Task 2
Используйте цикл while для решения задачи:
Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */

public class Task2 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) System.out.println("Task" + i++);

    }

}