package lesson7.shape.entities;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void calculatePer() {
        double per = (length+width) * 2;
        System.out.println("CV hình chữ nhật là: "+per);
    }

    @Override
    public void calculateArea() {

    }
}
