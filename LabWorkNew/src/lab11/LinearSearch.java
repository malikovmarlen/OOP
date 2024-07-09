package lab11;

public class LinearSearch {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"яблоко", "банан", "вишня", "ананас"};

        System.out.println(linearSearch(intArray, 3));
        System.out.println(linearSearch(strArray, "cherry"));
        System.out.println(linearSearch(strArray, "fig"));
    }
}
