package task4;

public class Rectangle implements Shape{

    private final double weight;
    private final double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + getArea() + "}";
    }
}
