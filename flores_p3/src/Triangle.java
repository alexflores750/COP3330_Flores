public class Triangle extends Shape2D {
    private double base;
    private double height;
    private String name;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
        this.name = "triangle";
    }

    @Override
    public double getArea() {
        double triangleArea = (base * height) / 2;
        return triangleArea;
    }

    @Override
    public String getName() {
        return name;
    }
}
