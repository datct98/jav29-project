package lesson4.foreach;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int arrA[] = {1,2, 4};
        *//*for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);
        }*//*

        for (int a: arrA){
            System.out.println(a);
        }*/
       /* printArray();
        int multi = calculateMultiN();
        System.out.println(multi);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số thứu 1: ");
        int x = scanner.nextInt();
        System.out.println("Mời b nhập số thứu 2: ");
        int y = scanner.nextInt();
        int a[] = {1,2,3,4,56};
        calculateSum(a, y);
    }

    public static int calculateSum(){
        // Khi muốn sau khi thwucj hiện xong đem giá trị đi gán vào biến
        int a= 10;
        int b= 20;
        int c = a+b;
        return c;
    }

    public static void calculateMulti() {
        // Khi chỉ đơn thuần muốn thực hiện xong thì thôi
        int a = 5;
        int b= 10;
        int c = a*b;
        System.out.println(c);
    }

    // Viế hàm thực hiện tính in ra các giá trị trong 1 array bằng cách sử dụng hàm void
    public static void printArray(){
        int arrA []= {1,5,2,5};
        for (int ar: arrA) {
            System.out.println(ar);
        }
    }

    // Viêt hàm thực hiện tính tích các số nguyên từ 1-> n bằng hàm return
    public static int calculateMultiN (){
        System.out.println("Mời b nhập vào 1 số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int multi = 1; // 1  * 1*2*3*4
        for (int i = 2; i <= n; i++) {
            multi*=i;
        }
        return multi;
    }

    public static void calculateSum(int [] a, int b){
        //int c = a+b;
        //System.out.println(c);
    }

}
