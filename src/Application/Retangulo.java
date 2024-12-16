package Application;

public class Retangulo {
    private double width;
    private double height;

    public Retangulo(double width, double height) {
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

    public double Perimeter(){
        return 2 * (height + width);
    }

    public double Area(){
        return width * height;
    }

    public String toString(){
        return   "The area of the rectangle is "
                + String.format("%.2f", Area())
                + ", and the perimeter is "
                + String.format("%.2f", Perimeter());
    }
}
