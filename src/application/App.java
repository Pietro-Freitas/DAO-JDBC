package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for(var sel : sellers) System.out.println(sel);

        System.out.println("\n=== TEST 3: seller findAll ===");
        sellers = sellerDao.findAll();
        for(var sel : sellers) System.out.println(sel);
  
        System.out.println("\n=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Gabriel", "Gabriel@gmail.com", new Date(), 2300.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());

        System.out.println("\n=== TEST 4: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Robert");
        sellerDao.update(seller);
        System.out.println("Update completed!");
    }
}
