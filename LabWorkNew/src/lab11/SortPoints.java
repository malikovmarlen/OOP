package lab11;

import java.util.Arrays;
import java.util.Random;

public class SortPoints {
    public static void main(String[] args) {
        Point[] points = new Point[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            points[i] = new Point(rand.nextDouble() * 100, rand.nextDouble() * 100);
        }

        Arrays.sort(points);
        System.out.println("Points sorted by x-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }

        Arrays.sort(points, new CompareY());
        System.out.println("Points sorted by y-coordinates:");
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
