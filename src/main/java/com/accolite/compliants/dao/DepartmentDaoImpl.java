package com.accolite.compliants.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.compliants.models.Department;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class DepartmentDaoImpl implements DepartmentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.DepartmentDao#createDepartment(com.accolite.compliants.models.Department)
	 */
	public boolean createDepartment(Department department) {
		// TODO Auto-generated method stub
		entityManager.persist(department);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.DepartmentDao#getDepartmentById(int)
	 */
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
    	return entityManager.find(Department.class, id);
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.DepartmentDao#getAllDepartment()
	 */
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
        return entityManager.createQuery("SELECT stu from Department stu").getResultList();
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.DepartmentDao#updateCandidate(com.accolite.compliants.models.Department)
	 */
	public boolean updateDepartment(Department department) {
		// TODO Auto-generated method stub
		entityManager.merge(department);
		return true;
	}
	

}
