public class Square extends Shape2D {
    private double length;
    private String name;

    public Square(double length) {
        super();
        this.length = length;
        this.name = "square";
        }
        @Override
        public double getArea() {
            double squareArea = length * length;
            return squareArea;
        }

        @Override
        public String getName() {
            return name;
        }
    }

