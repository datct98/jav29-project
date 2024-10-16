package lesson6.bt3.service;

import lesson7.shape.entities.Square;

import java.util.Scanner;

public class SquareService extends ShapeService{
    public Square inputInfo(Scanner scanner){
        System.out.println("side: ");
        int side= Integer.parseInt(scanner.nextLine());

        return new Square(side);
    }

    @Override
    public void calculatePer(Scanner scanner) {
        super.calculatePer(scanner);
    }

    @Override
    public void calculateArea(Scanner scanner) {
        super.calculateArea(scanner);
    }
}
