interface TwoDimensionalShape {
    double area();
}

interface ThreeDimensionalShape {
    double volume();
}

class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

class Cube implements ThreeDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }

    public double area() {
        return 6 * edge * edge;
    }
}