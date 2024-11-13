package lesson_45;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {

    public static void main(String[] args) {

        /*
        Виды ошибок:
        1. Ошибки компиляции - ошибки, возникающие на этапе компиляции программы;
        2. Ошибки времени выполнения*.

        * Время выполнения (Runtime) - это время, когда программа выполняется после её компиляции.

        Exceptions (исключения) - представляют собой события, которые возникают во время выполнения программы
        и нарушают её нормальное выполнение.
         */

//        int a = "Java";
//        String str = "Java"

//        System.out.println(1 / 0); // Java.lang.ArithmeticException
        int[] array = {1, 2, 4};
//         array[10] = 100; // java.lang.ArrayIndexOutOfBoundsException

        String str = null;
//        str.length(); // java.lang.NullPointerException

        /*
        Механизм обработки исключений

        try {
            // код, который может вызвать исключение
        } catch(ExceptionType ex) {
            // код обработки исключения
        } finally {
            // код, который выполнится в любом случае (или после завершения блока try, или после catch)
        }
         */

        int[] numbers = {1, 2, 5};
//        array[10] = 100;

        int res;
        try {
            numbers[10] = 1000;
            String s = "null";
            s.length();
            System.out.println(1 /0 );
            System.out.println("Код в блоке try");
        }
        catch (NullPointerException npe) {
            System.out.println("NPE caught");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Какая-то ошибка. " + ex.getMessage());
            System.out.println(ex.getClass());
//            ex.printStackTrace();
        } finally {
            // Этот код выполниться после блока try / catch - независимо, будет Exception или нет
            System.out.println("Finally code");
        }

        System.out.println("Код после присвоении значения в массив");

        System.out.println("\n==================\n");

        String url = getUrlString();
        System.out.println(url);

        System.out.println("\n======= throws");

        String url1 = null;
        try {
            url1 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(url1);
    }

    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = null;
        String defaultUrl = "https://www.google.com/";

        myUrl = new URL(defaultUrl);

        return myUrl.toString();
    }

    private static String getUrlString() {

        URL myUrl = null;
        String defaultUrl = "http://www.google.com/";

        try {
            myUrl = new URL("htps://www.google.com/");
            System.out.println("Next line of code");
        } catch (MalformedURLException exception) {
            System.out.println("Неверный формат URL: " + exception.getMessage());
            System.out.println(exception.toString());
            System.out.println("==========");
//            exception.printStackTrace();

            /*
            getMessage() - возвращает строку с коротким описанием исключения
            toString() - строковое представление исключения
            printStackTrace() - выводит трассировку исключения
             */

        } finally {
            if(myUrl == null) {
                try {
                    myUrl = new URL(defaultUrl);
                } catch (MalformedURLException e) {
                    System.out.println(e.getMessage());;
                }
            }
        }

        return myUrl.toString();
//        return myUrl == null ? "null" : myUrl.toString();
    }

}