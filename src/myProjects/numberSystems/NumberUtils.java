package myProjects.numberSystems;

public class NumberUtils {

    public static int binToDez (int binary) {

        int decimal = 0;

        String binaryAsString = String.valueOf(binary);

        int[] digits = new int[binaryAsString.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(binaryAsString.charAt(i));
        }

        int[] radices = new int[binaryAsString.length()];

        radices[radices.length - 1] = 1;
        for (int i = radices.length - 2; i >= 0; i--) {
            radices[i] = radices[i + 1] * 2;
        }

        for (int i = 0; i < digits.length; i++) {
            decimal += (digits[i] * radices[i]);
        }

        return decimal;

    }

}