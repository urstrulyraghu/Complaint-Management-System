package com.accolite.compliants.dao;

import java.util.List;

import com.accolite.compliants.models.Compliant;


public interface CompliantDao {
	
	public boolean createCompliant(Compliant compliant);
    
    public Compliant getCompliantById(int id);
    
    public List<Compliant> getAllCompliants();
    
    public boolean updateCompliant(Compliant compliant);
}
