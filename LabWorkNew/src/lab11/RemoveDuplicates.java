package lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicates {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 1, 2, 2, 3, 4, 4, 5);

        System.out.println(removeDuplicates(intList));
    }
}

