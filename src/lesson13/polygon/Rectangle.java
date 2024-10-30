package lesson13.polygon;

public class Rectangle implements Polygon{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("CHiều dài: "+length);
        System.out.println("Chiều rộng: "+width);
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double s = length*width;
        System.out.println("DIện tích hình chữ nhật là: "+s);
    }
}
