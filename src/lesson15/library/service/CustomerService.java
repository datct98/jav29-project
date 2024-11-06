package lesson15.library.service;
import lesson15.library.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService implements ActionService<Customer>{

    public Customer findById(int id, ArrayList<Customer> customers ){
        for (Customer customer: customers){
            if(customer.getId() == id){
                // Tìm thấy
                return customer;
            }
        }
        return null;
    }

    @Override
    public void insert(Scanner scanner, ArrayList<Customer> objs) {
        System.out.println("Mời  nhập tê KH: ");
        String name = scanner.nextLine();
        System.out.println("Mời  nhập sđt KH: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(name, phone);
        //DataBase.customers.add(customer);
        objs.add(customer);
    }

    @Override
    public void update(Scanner scanner, ArrayList<Customer> objs) {

    }

    @Override
    public void delete(Scanner scanner, ArrayList<Customer> objs) {
        System.out.println("Mời b nhập id của KH muốn xóa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());

        Customer customer = findById(id, objs);
        if(customer == null){
            // K tìm thấy
            System.out.println("K tồn tại KH có id= "+id);
        } else {
            //DataBase.customers.remove(customer);
            objs.remove(customer);
            System.out.println("Xóa thành công");
        }
    }
}
