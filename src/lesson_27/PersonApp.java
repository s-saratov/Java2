package lesson_27;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);

        System.out.println(Character.isLetterOrDigit('@'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLetterOrDigit('.'));
        System.out.println(Character.isLetterOrDigit('F'));
        System.out.println(Character.isLetterOrDigit('ы'));
        System.out.println(Character.isAlphabetic('R'));
    }

}