package lesson3.for_loop;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");  // Phần tử trùng lặp, sẽ bị bỏ qua

        System.out.println(fruits);  // Output: [Apple, Banana, Mango]
    }
}
