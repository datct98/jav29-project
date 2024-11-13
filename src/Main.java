import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    // Biến ở đây là biến toàn cục
    public static void main(String[] args) {
        // phép gán
        Scanner scanner = new Scanner(System.in);
        //double price = Double.parseDouble(scanner.nextLine());
        BigDecimal price = new BigDecimal(scanner.nextLine());
        System.out.println(price);
    }
}
