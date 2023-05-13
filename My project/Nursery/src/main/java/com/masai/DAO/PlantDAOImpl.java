package com.masai.DAO;

import java.util.List;

import com.masai.Entity.Customer;
import com.masai.Entity.Plant;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;

public class PlantDAOImpl implements PlantDAO{

	@Override
	public void addPlant(Plant plant) throws SomeThingWentWrongException {
		
		EntityManager em = EMUtils.getEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(plant);
			em.getTransaction().commit();
		
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again letter.");
		}finally {
			em.close();
		}
		
		

}

	@Override
	public Plant findPlant(int id) throws SomeThingWentWrongException, NoRecordFoundException {
		EntityManager em=EMUtils.getEntityManager();
		Plant cus=null;
		try {
			Query query=em.createQuery("select C from Plant C where C.plantID=:username");
			query.setParameter("username", id);
			cus=(Plant)query.getSingleResult();
			if(cus==null) {
				throw new NoRecordFoundException("No customerAvilable");
			}
		}catch(IllegalArgumentException ex) {
			throw new SomeThingWentWrongException("please try agian latter.");
		}
		finally {
			em.close();
		}
		return cus;
	}

	public List<Plant> getAllPlants() throws SomeThingWentWrongException {
		List<Plant> list=null;
		EntityManager em=null;
		try {
			em=EMUtils.getEntityManager();
			
			Query query=em.createQuery("select c from Plant c");
			list=query.getResultList();
			
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Unable to process request, try again later");
		}finally {
			em.close();
		}
		return list;
	}
}
