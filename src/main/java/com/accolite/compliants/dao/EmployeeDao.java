/**
 * 
 */
package com.accolite.compliants.dao;

import java.util.List;

import com.accolite.compliants.models.Employee;

/**
 * @author Raghuvardhan
 *
 */
public interface EmployeeDao {

	public boolean createEmployee(Employee employee);
    
    public Employee getEmployeeById(int id);
    
    public List<Employee> getAllEmployees();
    
    public boolean updateEmployee(Employee employee);
}
