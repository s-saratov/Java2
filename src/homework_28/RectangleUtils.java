package homework_28;

import lists.MyArrayList;
import lists.MyList;

public class RectangleUtils {

    public static void removeDuplicates(MyList<Rectangle> list, Rectangle rectangleToRemove) {
        if (!list.contains(rectangleToRemove)) return; // проверяем, содержится ли вообще в списке искомый прямоугольник
        int firstIndex = list.indexOf(rectangleToRemove); // находим индекс первого вхождения в список искомого пр-ка

        // Начиная с индекса первого вхождения удаляем из списка прямоугольники, совпадающие с искомым
        for (int i = firstIndex + 1; i < list.size(); i++) {
            if (rectangleToRemove.equals(list.get(i))) {
                list.remove(i);
            }
        }

    }

}