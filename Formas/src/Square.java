public class Square extends ShapeBase{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * side;
    }

    @Override
    public double calculateArea() {
        return 4 * side;
    }
}
