public class Rectangle {
    public double width;
    public double height;
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // modifier leurs dimensions
        r1.width = 5.0;
        r1.height = 3.0;

        r2.width = 2.5;
        r2.height = 4.5;

        // afficher leurs aires
        double area1 = r1.width * r1.height;
        double area2 = r2.width * r2.height;

        System.out.println("Aire de r1 = " + area1);
        System.out.println("Aire de r2 = " + area2);
    }
}
