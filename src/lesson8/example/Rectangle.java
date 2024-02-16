package lesson8.example;

public class Rectangle extends Border implements Shape, Filler{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean fillable() {
        return false;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
       return 2 * (height + width);
    }
    
}
