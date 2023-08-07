public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(6.0, 8.0, 5.0, 7.0, 9.0);

        System.out.println("Área e perímetro do Circulo");
        System.out.println("Área: " + circle.calculateArea());
        System.out.println("Perímetro: " + circle.calculatePerimeter());

        System.out.println("\nÁrea e perímetro do Quadrado");
        System.out.println("Área: " + square.calculateArea());
        System.out.println("Perímetro: " + square.calculatePerimeter());

        System.out.println("\nÁrea e perímetro do Triângulo");
        System.out.println("Área: " + triangle.calculateArea());
        System.out.println("Perímetro: " + triangle.calculatePerimeter());
    }
}
