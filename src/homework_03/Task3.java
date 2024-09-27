package homework_03;

/*
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */

public class Task3 {

    public static void main(String[] args) {

        double aPrice = 100.00;
        double bPrice = 500.00;
        int discount = 10;
        double discountedSum = ((aPrice + bPrice) / 100.00) * (100.00 - discount);
        System.out.println("Die Gesamtkosten für den Rabatt betragen " + discountedSum + " Euro");
        System.out.println("Der Gesamte Rabatt beträgt " + ((aPrice + bPrice) - discountedSum) + " Euro");

    }

}
