package lesson8.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.9);
        int border = circle.border();
        double area = circle.calculateArea();
        double peri = circle.calculatePerimeter();
        System.out.printf("Circle - Border: %d, Area: %f , Perimeter: %f", border, area, peri);
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        double border2 = rectangle.border(3);
        area = rectangle.calculateArea();
        peri = rectangle.calculatePerimeter();
        boolean fillable = rectangle.fillable();
        System.out.println();
        System.out.printf("Rectangle - Border: %f, Area: %f , Perimeter: %f, Fillable: %b", border2, area, peri, fillable);
    }
}
