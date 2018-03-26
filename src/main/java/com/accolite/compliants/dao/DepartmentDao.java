package com.accolite.compliants.dao;

import java.util.List;

import com.accolite.compliants.models.Department;

public interface DepartmentDao {
	
	public boolean createDepartment(Department Department);
    
    public Department getDepartmentById(int id);
    
    public List<Department> getAllDepartments();
    
    public boolean updateDepartment(Department Department);
}
