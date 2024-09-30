package homework_15;

public class Car {

    String brand;       // Марка
    String model;       // Модель
    int year;           // Год выпуска
    int horsepower;     // Лошадиные силы
    int tankCapacity;   // Объём топливного бака
    double consumption; // Расход топлива
    double fuel;        // Остаток топлива в баке

    public Car(String brand, String model, int year, int horsepower, int tankCapacity,
               double consumption, double fuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
        this.tankCapacity = tankCapacity;
        this.consumption = consumption;
        this.fuel = fuel;
    }

    public void getInfo() {
        System.out.println("Информация об автомобиле:");
        System.out.println("\t- марка: " + brand);
        System.out.println("\t- модель: " + model);
        System.out.println("\t- год выпуска: " + year);
        System.out.println("\t- мощность двигателя (л.с.): " + horsepower);
        System.out.println("\t- объём топливного бака: (л): " + tankCapacity);
        System.out.println("\t- потребление топлива (л/100 км): " + consumption);
        System.out.println("\t- остаток топлива в баке (л): " + fuel);
    }

    public void fillTheTank(Car car) {
        car.fuel = car.tankCapacity;
        System.out.printf("Вы залили топливо в автомобиль %s %s до полного бака. Текущий объём топлива в баке: %.1f л.\n",
                car.brand, car.model, car.fuel);
    }

    public void drive(Car car, int distance) {
        if (distance <= (fuel / consumption) * 100) {
            car.fuel = fuel - (distance / 100 * consumption);
            System.out.printf("Вы проехали %d км на автомобиле %s %s. Остаток топлива в баке: %.1f л.\n",
                    distance, car.brand, car.model, car.fuel);
        }
        else {
            double traveledDistance = (fuel / consumption) * 100;
            car.fuel = 0;
            System.out.printf("Вы проехали %.1f км на автомобиле %s %s. В баке закончилось топливо.\n",
                    traveledDistance, car.brand, car.model);
        }
    }

}