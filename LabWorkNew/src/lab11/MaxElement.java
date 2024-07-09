package lab11;

public class MaxElement {
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) return null;
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"яблоко", "банан", "вишня", "ананас"};

        System.out.println(max(intArray));
        System.out.println(max(strArray));
    }
}

