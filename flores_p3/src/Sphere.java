import java.lang.Math;

public class Sphere extends Shape3D {
    private double radius;
    private String name;

    public Sphere(double radius) {
        this.radius = radius;
        this.name = "sphere";
    }

    @Override
    public double getArea() {
       double sphereArea = 4 * Math.PI * (radius * radius);
       return sphereArea;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getVolume() {
        double sphereVolume = (4.0/3.0) * Math.PI * (radius * radius * radius);
        return sphereVolume;
    }
}
