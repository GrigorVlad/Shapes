public class Circle implements Shapes {
    private final double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
