package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời b nhập số nguyên N: ");
        int n= Integer.parseInt(scanner.nextLine());
        int [] arrInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("mời b nhập số thứ "+(i+1));
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arrInt[i]);
        }

        for (int i = 0; i < n; i++) {
            if(arrInt[i] %2 ==0){
                arrInt[i] = arrInt[i] + 1;
            }
        }
        System.out.println("Giá trị sau khi thay đổi: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrInt[i]);
        }

    }
}
