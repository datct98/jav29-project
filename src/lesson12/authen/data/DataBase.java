package lesson12.authen.data;

import lesson12.authen.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
    public static List<User> users = new ArrayList<>(Arrays.asList(
            new User("admin","123", "admin@gmail.com", 1),
            new User("sellerA","123", "admin@gmail.com", 2),
            new User("customerA","123", "admin@gmail.com", 3)));

}
