package lesson6.bt1;

import lesson6.bt1.entities.Product;
import lesson6.bt1.service.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        Product product = productService.inputInfo(scanner);
        System.out.println(product);
        productService.calculateVAT(product.getPrice());
    }
}
