package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
        
        System.out.println("=== TEST 2: department update ===");
        
        System.out.println("=== TEST 3: department delete ===");
        
        System.out.println("=== TEST 4: department find by id ===");
        
        System.out.println("=== TEST 5: department find all ===");
        List<Department> dep = new ArrayList<>();
        dep = departmentDao.findAll();
        for(Department x:dep) {
        	System.out.println(x);
        }
	}

}
