package com.masai.DAO;

import java.util.List;

import com.masai.Entity.Plant;
import com.masai.Entity.Seed;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class SeedDAOImpl implements SeedDAO{

public void addSeed(Seed seed) throws SomeThingWentWrongException {
		
		EntityManager em=EMUtils.getEntityManager();
		try {
			Query query=em.createQuery("SELECT COUNT(s) from Seed s where s.seedName=:commonname");
			query.setParameter("commonname", seed.getSeedName());
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

@Override
public List<Seed> getAllSeeds() throws SomeThingWentWrongException {
	List<Seed> list=null;
	EntityManager em=null;
	try {
		em=EMUtils.getEntityManager();
		
		Query query=em.createQuery("select c from Seed c");
		list=query.getResultList();
		
	}catch(PersistenceException ex) {
		throw new SomeThingWentWrongException("Unable to process request, try again later");
	}finally {
		em.close();
	}
	return list;
}
}
