public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0); 
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // getters si besoin
    public int getX() { return x; }
    public int getY() { return y; }
}

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println("Point initial : " + p);

        p.translate(3, 4);
        System.out.println("Après translation : " + p);
    }
}
