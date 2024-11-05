package lesson_38;

import lists.MyList;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 2, 3, 0, 4};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abbb", "Cccc", "apple", "Zebra"};

        System.out.println(Arrays.toString(strings));

        Car[] cars = new Car[5];
        cars[0] = new Car ("Alfa", 2021, 120);
        cars[1] = new Car ("BMW", 2000, 190);
        cars[2] = new Car ("Citroen", 2018, 190);
        cars[3] = new Car ("VW", 2021, 250);
        cars[4] = new Car ("Ferrari", 2024, 300);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n====================\n");

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        Arrays.sort(cars, carSpeedComparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n====================\n");

        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);

        System.out.println(Arrays.toString(cars));

        System.out.println("\n========== Anonymous class ==========\n");

        // Анонимный класс
        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        // Сравнить автомобили по году в порядке возрастания,
        // если год совпадает - сравнить такие автомобили по модели в порядке убывания (обратный естественному)

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();

                if (yearCompare == 0) {
                    // годы оказались равны
                    return c2.getModel().compareTo(c1.getModel());
                } else return yearCompare;
            }
        });

        System.out.println(Arrays.toString(cars));

        // Функциональный интерфейс - это особый тип интерфейса, который имеет только один абстрактны метод

        // Лямбда - выражения - способ краткой записи анонимных функций. Лямбда используется исключительно
        // для реализации функциональных интерфейсов.

        // (параметр) -> { тело выражения }

        // Когда реализация состоит из одного выражения, фигурные скобки не требуются,
        // ключевое слово return не используется. Результат выражения автоматически возвращается
        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());
        System.out.println(Arrays.toString(cars));

        // Когда появляется блок {} - я должен использовать return
        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed() - car2.getSpeed();
        });

        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();

            // альтернативный способ сравнения двух int
            yearCompare = Integer.compare(c1.getYear(), c2.getYear());

            // Если хотим использовать compareTo (так лучше не делать!)
            // Integer.valueOf(c1.getYear()).compareTo(Integer.valueOf(c2.getYear()));

            if (yearCompare == 0) {
                // годы оказались равны
                return c2.getModel().compareTo(c1.getModel());
            } else return yearCompare;
        });

        System.out.println(Arrays.toString(cars));

        // Компаратор с использованием лямбда-выражения.
        // Отсортировать автомобили по году выпуска в порядке возрастания.
        // Если год совпадает - такие автомобили отсортировать по скорости в порядке возрастания.

        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();
            if (yearCompare == 0) {
                return c1.getSpeed() - c2.getSpeed();
            } else return yearCompare;
        });

        System.out.println(Arrays.toString(cars));

        Comparator<Car> comparator = (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());

            if (yearCompare == 0) {
                return Integer.compare(car1.getSpeed(), car2.getSpeed());
            }

            return yearCompare;
        };

        Arrays.sort(cars, comparator);

        System.out.println(Arrays.toString(cars));

        // Реализовать компаратор c использованием лямбда-выражения
        // для сортировки автомобилей по году выпуска в обратном порядке

        /*
        v1 = 200, v2 = 100
        Машина с большей скоростью считается "меньшей"
        (v1, v2) -> Если v1 считается меньшим, чем v2 -> метод должен вернуть отрицательное значение
        v1 - v2 -> если скорость v1 меньше, чем v2, результат будет отрицательный,
        т.е. v1 будет признана меньше, чем v2

        v2 - v1 -> если скорость v1 меньше, чем v2 -> результат будет положительный,
        т.е. v1 признана больше (т.к. рузльтат положительный)

        (v1, v2) -> сравниваем
        v1 - v2 -> если v1 больше v2 -> результат положительный,
        т.е. v1 будет признан большим, чем v2
        v2 - v1 -> если v1 больше чем v2 -> результат отрицательный, т.е. v2 признаётся большим
         */

        /*
        Сравнение по скорости.

        1. Если мы хотим прямой порядок сортировки -> от меньшего к большему
        car1.getSpeed - car2
        car1.getYear - car2

        2. Порядок сортировки по убыванию
        car2.getSpeed - car1.getSpeed
        car2.getYear - car1.getYear
         */

        Arrays.sort(cars, (car1, car2) -> Integer.compare(car2.getYear(), car1.getYear()));

        System.out.println(Arrays.toString(cars));

        // TODO: Comparator - статические методы

        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        // Две альтернативы поменять порядок
        Arrays.sort(cars, Comparator.comparing(Car::getModel).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Car::getModel));

    }

}