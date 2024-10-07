package lesson4;

import java.util.Scanner;

public class MultyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số dòng: ");
        int row = scanner.nextInt();
        System.out.println("Mời b nhập số cột: ");
        int column = scanner.nextInt();

        int arr [][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Mời b nhập a["+i+"]["+j+"]");
                arr[i][j] = scanner.nextInt();
                System.out.println(arr[i][j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
