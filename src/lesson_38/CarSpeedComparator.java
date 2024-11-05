package lesson_38;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {

        /*
        car1 < car2 -> отрицательное
        car1 = car2 -> 0
        car1 > car2 -> положительное
         */

        // от меньшего к большему
        return car1.getSpeed() - car2.getSpeed();

        // от большего к меньшему
        // return car2.getSpeed() - car1.getSpeed();
    }
}