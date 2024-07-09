package lab11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.nanoTime();
        System.out.println("Time using iterator: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time using get(index): " + (endTime - startTime) + " ns");
    }
}

