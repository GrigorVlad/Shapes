public class Square implements Shapes {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }
}
