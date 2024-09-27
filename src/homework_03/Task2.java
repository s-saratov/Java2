package homework_03;

/*
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Сколько программа отбросила в дробной части?
*/

public class Task2 {

    public static void main(String[] args) {

        int var0 = 0;
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int sum = (var0 + var1 + var2 + var3) / 4;
        double sumDouble = (var0 + var1 + var2 + var3) / 4.0;
        System.out.println("Das arithmetische Mittel ist " + sum);
        System.out.println("Verworfener Bruchteil ist " + (sumDouble - sum));

    }

}
