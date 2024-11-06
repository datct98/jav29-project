package lesson15.library.service;

import lesson15.library.entities.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public interface ActionService <T> {
    void insert(Scanner scanner, ArrayList<T> objs);
    void update(Scanner scanner, ArrayList<T> objs);
    void delete(Scanner scanner, ArrayList<T> objs);
}
