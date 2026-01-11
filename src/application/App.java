package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department  obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "Bob@gmail.com", LocalDate.now(), 2300.00, obj);
        System.out.println(obj);
        System.out.println(seller.toString());
    }
}
