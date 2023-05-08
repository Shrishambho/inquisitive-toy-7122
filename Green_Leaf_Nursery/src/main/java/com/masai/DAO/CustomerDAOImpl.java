package com.masai.DAO;

import com.masai.Entity.Customer;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(Customer cst) throws SomeThingWentWrongException {
		EntityManager em=EMUtils.getEntityManager();
		try {
			Query query=em.createQuery("select count(C) from Customer C where C.username=:username");
			query.setParameter("username", cst.getUsername());
			if((Long)query.getSingleResult()>0) {
				throw new SomeThingWentWrongException("The username "+cst.getUsername()+" is already used.");
			}
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(cst);
			et.commit();
			
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again later.");
		}finally {
			em.close();
		}
		
	}

}
