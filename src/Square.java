public class Square extends BaseArea {
    private double length;

    public Square(double  length) {
        this.length = length;
    }

    public double circumference() {
        return this.length * 4;
    }

    public double area() {
        return Math.pow(this.length,2);
    }

    public boolean isSquare() {
        return true;
    }

    public Square toSquare() {
        return new Square(this.length);
    }

    public String toString() {
        return "Square: { Side length = " + length + super.toString() + " }";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}
