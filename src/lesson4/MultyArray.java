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
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j] %3 == 0){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println(sum);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
