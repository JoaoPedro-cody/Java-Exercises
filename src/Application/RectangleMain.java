package Application;

public class RectangleMain {
    private double width;
    private double height;

    public RectangleMain(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double perimeter(){
        return 2 * (height + width);
    }

    public double area(){
        return width * height;
    }

    @Override
    public String toString(){
        return   "The area of the rectangle is "
                + String.format("%.2f", area())
                + ", and the perimeter is "
                + String.format("%.2f", perimeter());
    }
}
