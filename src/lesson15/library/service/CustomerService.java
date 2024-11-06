package lesson15.library.service;

import lesson15.library.data.DataBase;
import lesson15.library.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public void insert(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("Mời  nhập tê KH: ");
        String name = scanner.nextLine();
        System.out.println("Mời  nhập sđt KH: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(name, phone);
        //DataBase.customers.add(customer);
        customers.add(customer);
    }

    public void update(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("Mời b nhập id của KH muốn cập nhật thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());

        Customer customer = findById(id, customers);
        if(customer == null){
            // K tìm thấy
            System.out.println("K tồn tại KH có id= "+id);
        } else {
            System.out.println("Mời  nhập tê KH: ");
            String name = scanner.nextLine();
            System.out.println("Mời  nhập sđt KH: ");
            String phone = scanner.nextLine();
            customer.setName(name);
            customer.setPhone(phone);
        }
    }

    public void delete(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("Mời b nhập id của KH muốn xóa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());

        Customer customer = findById(id, customers);
        if(customer == null){
            // K tìm thấy
            System.out.println("K tồn tại KH có id= "+id);
        } else {
            //DataBase.customers.remove(customer);
            customers.remove(customer);
            System.out.println("Xóa thành công");
        }
    }

    private Customer findById(int id, ArrayList<Customer> customers ){
        for (Customer customer: customers){
            if(customer.getId() == id){
                // Tìm thấy
                return customer;
            }
        }
        return null;
    }
}
