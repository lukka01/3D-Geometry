public class RegularPolygon extends BaseArea {
    private int n;
    private double  length;

    public RegularPolygon(int n, double length) {
        this.n = n;
        this.length = length;
    }

    public double circumference() {
        return length * n;
    }

    public double area() {
        double A = Math.pow(length,2) * n;
        double B = 4 * Math.tan(Math.PI/n);
        return A/B;
    }

    public boolean isSquare() {
        return n == 4;
    }

    public Square toSquare() {
        if (isSquare()) {
            return new Square(length);
        } else {
            return null;
        }
    }


    public int getN() {
        return n;
    }

    public double getLength() {
        return length;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
