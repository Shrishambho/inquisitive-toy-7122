package com.masai.DAO;

import com.masai.Entity.Plant;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class PlantDAOImpl implements PlantDAO {

	@Override
	public void addPlant(Plant plant) throws SomeThingWentWrongException {
		EntityManager em=EMUtils.getEntityManager();
		try {
			Query query=em.createQuery("SELECT COUNT(p) from Plant p where p.commonName=:commonname");
			query.setParameter("commonname", plant.getCommonName());
			if((Long)query.getSingleResult()>0) {
				throw new SomeThingWentWrongException("Plant already present.");
			}
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(plant);
			et.commit();
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again letter.");
		}finally {
			em.close();
		}
		
		
	}

	
	

}
