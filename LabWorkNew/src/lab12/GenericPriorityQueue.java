package lab12;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GenericPriorityQueue<E> {
    private PriorityQueue<E> queue;

    public GenericPriorityQueue(Comparator<? super E> comparator) {
        queue = new PriorityQueue<>(comparator);
    }

    public void offer(E e) {
        queue.offer(e);
    }

    public E poll() {
        return queue.poll();
    }

    public int getSize() {
        return queue.size();
    }

    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> b - a;
        GenericPriorityQueue<Integer> priorityQueue = new GenericPriorityQueue<>(comparator);

        priorityQueue.offer(1);
        priorityQueue.offer(3);
        priorityQueue.offer(2);

        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("Queue size: " + priorityQueue.getSize());
    }
}

