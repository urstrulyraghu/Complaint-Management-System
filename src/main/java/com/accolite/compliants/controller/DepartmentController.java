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

import com.accolite.compliants.dao.DepartmentDaoImpl;
import com.accolite.compliants.models.Department;
/**
 * @author Raghuvardhan
 *
 */

@RestController
public class DepartmentController {	
	
    @Autowired
    private DepartmentDaoImpl departmentDaoImpl;

    
    /*** Creating a new Department ***/
    @RequestMapping(value="/create/department", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createDepartment(@RequestBody Department department)
    {
        departmentDaoImpl.createDepartment(department);
    }
    
    /*** Retrieve a single Department ***/
    @RequestMapping(value="/department/{name}", produces="application/json",
            method=RequestMethod.GET)
    public Department getDepartmentById(@PathVariable("id") int id){
    	return departmentDaoImpl.getDepartmentById(id);  	
    }
    
    /*** Retrieve all Departments ***/
    @RequestMapping(value="/departments", produces="application/json",
            method=RequestMethod.GET)
    public List<Department> getAllDepartments()
    {	    	
        return departmentDaoImpl.getAllDepartments();
    }
    
    /*** Update a Department ***/
    @RequestMapping(value="/update/department", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateDepartment(@RequestBody Department department)
    {
    	departmentDaoImpl.updateDepartment(department);
    }
    
}
