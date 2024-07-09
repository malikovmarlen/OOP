package lab11;

import java.util.Comparator;

class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.y != p2.y) {
            return Double.compare(p1.y, p2.y);
        } else {
            return Double.compare(p1.x, p2.x);
        }
    }
}
