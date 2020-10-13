import java.lang.Math;


public class Circle extends Shape2D {
    private double radius;
    private String name;

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.name = "circle";
    }

    @Override
    public double getArea() {
        double circleArea = Math.PI * (Math.pow(radius, 2));
        return circleArea;
    }

    @Override
    public String getName() {
        return name;
    }
}
