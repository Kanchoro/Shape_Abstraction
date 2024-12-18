public class Ellipse extends Shape{
    private double semiMajorAxis; // Большая полуось
    private double semiMinorAxis; // Малая полуось

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double getPerimeter() {
        // Формула Рамануджана для приближённого периметра эллипса
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) -
                Math.sqrt((3 * semiMajorAxis + semiMinorAxis) * (semiMajorAxis + 3 * semiMinorAxis)));
    }
}
