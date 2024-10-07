package homework_18;

public class DogMain {

    public static void main(String[] args) {

        System.out.println("1. Создаём собаку по кличке Bello c начальной высотой прыжка 60 сантиметров.\n");
        Dog bello = new Dog("Bello", 60);

        System.out.println("2. Проводим первую тренировку Bello.");
        bello.train();

        System.out.println("\n3. Проверяем, сможет ли Bello взять барьер высотой 70 сантиметров:");
        bello.jumpBarrier(70);

        System.out.println("\n4. Даём Bello команду взять барьер высотой 100 сантиметров:");
        bello.jumpBarrier(100);

        System.out.println("\n5. Узнаём, имеет ли смысл Bello пытаться взять барьер высотой 130 сантиметров:");
        bello.jumpBarrier(130);

    }

}
