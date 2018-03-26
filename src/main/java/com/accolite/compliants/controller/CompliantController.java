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

import com.accolite.compliants.dao.CompliantDaoImpl;
import com.accolite.compliants.models.Compliant;
/**
 * @author Raghuvardhan
 *
 */

@RestController
public class CompliantController {	
	
    @Autowired
    private CompliantDaoImpl compliantDaoImpl;

    
    /*** Creating a new Compliant ***/
    @RequestMapping(value="/create/compliant", method=RequestMethod.POST, 
            produces="application/json", consumes="application/json")
    public void createCompliant(@RequestBody Compliant compliant)
    {
        compliantDaoImpl.createCompliant(compliant);
    }
    
    /*** Retrieve a single Compliant ***/
    @RequestMapping(value="/compliant/{id}", produces="application/json",
            method=RequestMethod.GET)
    public Compliant getCompliantById(@PathVariable("id") int id){
    		return compliantDaoImpl.getCompliantById(id);
    }
    
    /*** Retrieve all Compliants ***/
    @RequestMapping(value="/compliants", produces="application/json",
            method=RequestMethod.GET)
    public List<Compliant> getAllCompliants()
    {	    	
        return compliantDaoImpl.getAllCompliants();
    }
    
    /*** Update a Compliant ***/
    @RequestMapping(value="/update/compliant", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public void updateCompliant(@RequestBody Compliant compliant)
    {
    	compliantDaoImpl.updateCompliant(compliant);
    }
    

}
