package login_tach_ham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("techmaster", "hoclacoviec", 10000);
        //
        Scanner scanner = new Scanner(System.in);

        boolean checkLogin = login(scanner, account);
        if(checkLogin){
            displayMenu();
            int  choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    displayUserInfo();
                    break;
                case 2:

                    break;
            }
        }
    }

    public static void displayMenu(){
        System.out.println("========== Menu =========");
        System.out.println("1- Hiển thị thông tin tài khoản");
        System.out.println("2- Rút tiền");
        System.out.println("Mời b lựa chọn: ");
    }

    public static boolean login(Scanner scanner, Account accountSys){

        System.out.println("Mời b nhập username:");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password:");
        String password = scanner.nextLine();
        if(username.equals(accountSys.getUsername()) & password.equals(accountSys.getPassword())){
            System.out.println("Login successful");
            return true;
        } else
            return false;
    }
    public static void displayUserInfo(){

    }


}
