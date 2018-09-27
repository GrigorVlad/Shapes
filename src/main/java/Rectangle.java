public class Rectangle implements Shapes {
    private final double side1;
    private final double side2;

    public Rectangle (double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return this.side1 * this.side2;
    }
}
