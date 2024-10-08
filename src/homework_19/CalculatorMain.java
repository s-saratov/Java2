package homework_19;

public class CalculatorMain {

    public static void main(String[] args) {

        System.out.print("1. Вычисление длины окружности с радиусом 15: " + Calculator.getCircumference(15));

        System.out.print("\n2. Вычисление длины окружности с радиусом 12,345: " + Calculator.getCircumference(12.345));

        System.out.print("\n3. Вычисление длины окружности с радиусом -15: " + Calculator.getCircumference(-15));

        System.out.print("\n4. Вычисление площади круга с радиусом 15: " + Calculator.getCircleArea(15));

        System.out.print("\n5. Вычисление площади круга с радиусом 12,345: " + Calculator.getCircleArea(12.345));

        System.out.print("\n6. Вычисление площади круга с радиусом -15: " + Calculator.getCircleArea(-15));

    }

}