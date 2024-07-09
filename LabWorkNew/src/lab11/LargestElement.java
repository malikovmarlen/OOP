package lab11;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElement {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) return null;
        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 1, 2, 3, 4, 5);

        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "яблоко", "банан", "вишня", "ананас");

        System.out.println(max(intList));
        System.out.println(max(strList));
    }
}
