package homework_03;

/*
В классе HomeWork03 задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.

Переменная 1 - сколько Вам полных лет
Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))
*/

public class Task1 {

    public static void main(String[] args) {

        int myAge = 36;
        double milkPrice = 1.29;
        String myName = "Sergej";

        System.out.println("Ich bin " + myAge + " Jahre alt");
        System.out.println("Die Milch kostet " + milkPrice + " Euro");
        System.out.println("Ich heiße " + myName);

    }

}
