package lesson6.bt3.service;

import lesson7.shape.entities.Rectangle;

import java.util.Scanner;

public class RectangleService extends ShapeService{
    public Rectangle inputInfo(Scanner scanner){
        System.out.println("Length: ");
        int length= Integer.parseInt(scanner.nextLine());
        System.out.println("Width: ");
        int width= Integer.parseInt(scanner.nextLine());
        return new Rectangle(length, width);
    }

    @Override
    public void calculatePer(Scanner scanner) {
        Rectangle rectangle = inputInfo(scanner);
        double value = rectangle.getLength()+ rectangle.getWidth() * 2;
        System.out.println("CV HCN: "+ value);
    }

    @Override
    public void calculateArea(Scanner scanner) {

    }
}
