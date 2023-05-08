package com.masai.DAO;

import com.masai.Entity.Planter;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class PlanterDAOImpl implements PlanterDAO {

	
	public void addPlanter(Planter planter) throws SomeThingWentWrongException {
		
		EntityManager em=EMUtils.getEntityManager();
		try {
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(planter);
			et.commit();
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again");
		}finally {
			em.close();
		}
	}

}
