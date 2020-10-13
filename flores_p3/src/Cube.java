public class Cube extends Shape3D {
    private double length;
    private String name;

    public Cube(double length) {
        super();
        this.length = length;
        this.name = "cube";
    }

    @Override
    public double getArea() {
        double cubeArea = 6 * (length * length);
        return cubeArea;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getVolume() {
        double cubeVolume = length * length * length;
        return cubeVolume;
    }
}
