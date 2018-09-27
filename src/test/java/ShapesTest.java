import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    final int RADIUS = 5;
    final int SIDE_SQUARE = 5;
    final int SIDE_A = 5;
    final int SIDE_B = 5;

    Shapes circle = new Circle(RADIUS);
    Shapes rectangle = new Rectangle(SIDE_A, SIDE_B);
    Shapes square = new Square(SIDE_SQUARE);


    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(Math.PI * RADIUS * RADIUS, circle.getArea());
        assertEquals(SIDE_SQUARE * SIDE_SQUARE, square.getArea());
        assertEquals(SIDE_A * SIDE_B, rectangle.getArea());

    }
}