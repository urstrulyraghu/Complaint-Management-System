/**
 * 
 */
package com.accolite.compliants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.compliants.dao.EmployeeDaoImpl;
import com.accolite.compliants.models.Employee;
/**
 * @author Raghuvardhan
 *
 */

@RestController
public class EmployeeController {
		
    @Autowired
    private EmployeeDaoImpl employeeDaoImpl;

    
    /*** Creating a new Employee ***/
    @RequestMapping(value="/create/employee", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createEmployee(@RequestBody Employee employee)
    {
        employeeDaoImpl.createEmployee(employee);
    }
    
    /*** Retrieve a single Employee ***/
    @RequestMapping(value="/employee/{name}", produces="application/json",
            method=RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable("id") int id){
    		return employeeDaoImpl.getEmployeeById(id);
    }
    
    /*** Retrieve all Employees ***/
    @RequestMapping(value="/employees", produces="application/json",
            method=RequestMethod.GET)
    public List<Employee> getAllEmployees()
    {	    	
        return employeeDaoImpl.getAllEmployees();
    }
    
    /*** Update a Employee ***/
    @RequestMapping(value="/update/employee", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateEmployee(@RequestBody Employee employee)
    {
    	employeeDaoImpl.updateEmployee(employee);
    }
    

}
