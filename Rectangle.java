public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        if (w < 0) {
            throw new IllegalArgumentException("La largeur ne peut pas être négative.");
        }
        this.width = w;
    }

    public void setHeight(double h) {
        if (h < 0) {
            throw new IllegalArgumentException("La hauteur ne peut pas être négative.");
        }
        this.height = h;
    }

    public double area() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setWidth(5.0);
        r1.setHeight(3.0);

        r2.setWidth(2.5);
        r2.setHeight(4.5);

        System.out.println("Aire de r1 = " + r1.area());
        System.out.println("Aire de r2 = " + r2.area());

    
}
