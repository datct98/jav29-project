package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số nguyên a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập số nguyên b: ");
        double b = Double.parseDouble(scanner.nextLine());

        /* Giải PT bậc 1
        if(a == 0 && b==0){
            System.out.println("PT vô số nghiệm");
        } else if(a == 0){
            System.out.println("PT vô nghiệm");
        } else {
            double x = -b/a;
            System.out.println(x);
        }*/
        /*System.out.println("Mời b nhập số nguyên c: ");
        double c = Double.parseDouble(scanner.nextLine());
        //  a*x^2 + b*x +c = 0
        if(a == 0){
            //0*x^2 + b*x +c = 0 ->  b*x +c = 0
            // Giải pt b1
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            if(delta<0){

            } else if ((delta == 0)){

            } else {

            }
        }*/
    }
}
