public abstract class ShapeCircle {
    public abstract double getArea(double r);
    public abstract double getCircum(double r);
}

class Circle1 extends ShapeCircle {
    @Override
    public double getArea(double r) {
        return 3.14 * r * r;
    }

    @Override
    public double getCircum(double r) {
        return 3.14 * 2 * r;
    }
}
