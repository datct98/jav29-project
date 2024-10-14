package lesson6.bt1.service;

import lesson6.bt1.entities.Product;

import java.util.Scanner;

public class ProductService {
    public Product inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập giá sp: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập ID sp: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }

    public void calculateVAT(double price){
        double vat = 0.1 * price;
        System.out.println("Thuế sp của bạn là: "+vat);
    }
}
