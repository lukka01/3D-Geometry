public class Circle extends BaseArea {
    private double radius;

    public  Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double circumference() {
        return Math.PI * 2 * radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString() {
        return "Circle: { Radius:" + this.radius + super.toString() + "}";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
