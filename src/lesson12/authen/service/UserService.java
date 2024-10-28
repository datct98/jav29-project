package lesson12.authen.service;

import lesson12.authen.data.DataBase;
import lesson12.authen.entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    public void register(Scanner scanner){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        // Check input username
        do {
            if(findByUsername(username)!=null){
                System.out.println("Username đã tồn tại");
            } else {
                break;
            }
        } while (true);

        // Validate
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        System.out.println("Mời b nhập email: ");
        String email = scanner.nextLine();
        // Check input email
        do {
            if(findByEmail(email)!=null){
                System.out.println("email đã tồn tại");
            } else {
                break;
            }
        } while (true);

        User user = new User(username,password,email,3);
        DataBase.users.add(user);
    }

    public User login(Scanner scanner){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        User user = findByUsernameAndPassword(username, password);
        if(user!=null){
            System.out.println("Login successfully");
        } else {
            // Thất bại
        }

        return user;
    }

    public void updateEmail(Scanner scanner, User user){
        System.out.println("Mời b nhập email: ");
        String email = scanner.nextLine();
        User userEmail = findByEmail(email);
        if(userEmail!=null){
            System.out.println("Email đã tồn tại");
        } else {
            user.setEmail(email);
        }
    }

    public void updateUsername(Scanner scanner, User user){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        User userEmail = findByUsername(username);
        if(userEmail!=null){
            System.out.println("username đã tồn tại");
        } else {
            user.setUsername(username);
        }
    }

    private User findByEmail(String email){
        for (User user: DataBase.users){
            if(user.getEmail().equals(email))
                return user;
        }
        return null;
    }

    private User findByUsername(String username){
        for (User user: DataBase.users){
            if(user.getUsername().equals(username))
                return user;
        }
        return null;
    }

    private User findByUsernameAndPassword(String username, String password){
        for (User user: DataBase.users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password))
                return user;
        }
        return null;
    }
}
