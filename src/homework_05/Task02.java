package homework_05;

/*
Task 2

Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.

Task 2.2 * (Опционально)

Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */

public class Task02 {

    public static void main(String[] args) {

        //Task 2

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String concatStr = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Первый способ конкатенации: " + concatStr);

        concatStr = String.join(" ", str1, str2, str3, str4, str5);
        System.out.println("Второй способ конкатенации: " + concatStr);

        System.out.println("\nДлина объединённой строки составляет " + concatStr.length() + " символов.\n");

        // Task 2.2

        String newStr = concatStr.replace("powerful", "super");
        System.out.println("Изменённая строка: " + newStr);

        boolean ageContent = newStr.contains("age");
        System.out.println("\nЗначение переменной ageContent: "+ ageContent);

        // Поиск индекса вхождения подстроки в строку
        
        int index = newStr.indexOf("age");
        System.out.println("\nindex: " + index);
        
        String replaceMe = "AbAbAbAc";
        int indexAb1 = replaceMe.indexOf("Ab");
        System.out.println("indexAb1: " + indexAb1);
        int indexAb2 = replaceMe.lastIndexOf("Ab");
        System.out.println("indexAb2: " + indexAb2);


    }

}
