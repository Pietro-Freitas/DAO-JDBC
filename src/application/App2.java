package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: department findById ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("=== Test 2: department findAll ===");
        List<Department> departments = departmentDao.findAll();
        for(var dep : departments) System.out.println(dep);

        System.out.println("=== Test 3: department insert ===");
        department = new Department(null, "Music");
        departmentDao.insert(department);
        System.out.println("Inserted! new id: " + department.getId());

        System.out.println("=== Test 4: department delete ===");
        Integer id = 6;
        departmentDao.deleteById(id);
        System.out.println("Deleted!");

        System.out.println("=== Test 5: department update ===");
        department = new Department(3, "Food");
        departmentDao.update(department);
        System.out.println("Department updated!");
    }
}
