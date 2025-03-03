public class Rectangle extends BaseArea {
    private double width;
    private double height;

    public Rectangle (double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double circumference() {
        return (width + height) * 2;
    }

    public double area() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }

    @Override
    public Square toSquare() {
        if (isSquare()) {
            return new Square(width);
        } else {
            return  super.toSquare();
        }
    }

    @Override
    public String toString() {
        return "Rectangle : { Width: " + width + "Height: "
                + height + super.toString() + " }";
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
