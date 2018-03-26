package com.accolite.compliants.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accolite.compliants.models.Compliant;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CompliantDaoImpl implements CompliantDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.CompliantDao#createCompliant(com.accolite.compliants.models.Compliant)
	 */
	public boolean createCompliant(Compliant Compliant) {
		// TODO Auto-generated method stub
		entityManager.persist(Compliant);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.CompliantDao#getCompliantById(int)
	 */
	public Compliant getCompliantById(int id) {
		// TODO Auto-generated method stub
    	return entityManager.find(Compliant.class, id);
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.CompliantDao#getAllCompliant()
	 */
	public List<Compliant> getAllCompliants() {
		// TODO Auto-generated method stub
        return entityManager.createQuery("SELECT stu from Compliant stu").getResultList();
	}

	/* (non-Javadoc)
	 * @see com.accolite.compliants.dao.CompliantDao#updateCandidate(com.accolite.compliants.models.Compliant)
	 */
	public boolean updateCompliant(Compliant Compliant) {
		// TODO Auto-generated method stub
		entityManager.merge(Compliant);
		return true;
	}
}
