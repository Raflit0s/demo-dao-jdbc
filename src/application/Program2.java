package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
        
        System.out.println("=== TEST 2: department update ===");
        Department newDepartment = new Department(7, "Music");
        departmentDao.update(newDepartment);
        System.out.println("Update finished!");
	}

}
