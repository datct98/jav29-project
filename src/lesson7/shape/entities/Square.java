package lesson7.shape.entities;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void calculatePer() {
        double per = side*4;
        System.out.println("CV hình vuông là: "+per);
    }

    @Override
    public void calculateArea() {
        double per = side*side;
        System.out.println("Diện tích hình vuông là: "+per);
    }
}
