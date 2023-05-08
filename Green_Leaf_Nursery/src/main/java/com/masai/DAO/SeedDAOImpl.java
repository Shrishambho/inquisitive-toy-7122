package com.masai.DAO;

import com.masai.Entity.Plant;
import com.masai.Entity.Seed;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class SeedDAOImpl implements SeedDAO {

	
	public void addSeed(Seed seed) throws SomeThingWentWrongException {
		
		EntityManager em=EMUtils.getEntityManager();
		try {
			Query query=em.createQuery("SELECT COUNT(s) from Seed s where s.commonName=:commonname");
			query.setParameter("commonname", seed.getCommonName());
			if((Long)query.getSingleResult()>0) {
				throw new SomeThingWentWrongException("Seed already present.");
			}
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(seed);
			et.commit();
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again letter.");
		}finally {
			em.close();
		}
		
		
	}

	

}
