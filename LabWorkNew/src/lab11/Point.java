package lab11;

class Point implements Comparable<Point> {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x != o.x) {
            return Double.compare(this.x, o.x);
        } else {
            return Double.compare(this.y, o.y);
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}




