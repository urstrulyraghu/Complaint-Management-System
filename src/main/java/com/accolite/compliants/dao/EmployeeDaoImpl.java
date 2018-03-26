/**
 * 
 */
package com.accolite.compliants.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.compliants.models.Employee;

/**
 * @author Raghuvardhan
 *
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl implements EmployeeDao {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.EmployeeDao#createEmployee(com.accolite.compliants.models.Employee)
	 */
	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.persist(employee);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.EmployeeDao#getEmployeeById(int)
	 */
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
    	return entityManager.find(Employee.class, id);
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.EmployeeDao#getAllEmployee()
	 */
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
        return entityManager.createQuery("SELECT stu from Employee stu").getResultList();
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.EmployeeDao#updateCandidate(com.accolite.compliants.models.Employee)
	 */
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.merge(employee);
		return true;
	}
	
}
