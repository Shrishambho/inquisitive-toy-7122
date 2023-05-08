package com.masai.DAO;

import java.util.HashSet;
import java.util.Set;

import com.masai.Entity.Plant;
import com.masai.Entity.Planter;
import com.masai.Entity.Seed;
import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;

public class PlanterDAOImpl implements PlanterDAO {

	public void addPlanter(Planter planter) throws SomeThingWentWrongException {
		
		EntityManager em=null;
		try {
			
			em=EMUtils.getEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(planter);
			et.commit();
			
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again later.");
		}finally {
			em.close();
		}
		
	}

	
	public void updatePlanter(int pid, int sid, int plid) throws SomeThingWentWrongException, NoRecordFoundException {
	
		EntityManager em=null;
		try {
			em=EMUtils.getEntityManager();
			Plant plant=em.find(Plant.class, pid);
			if(plant==null) {
				throw new NoRecordFoundException("No plant with id present");
			}
			Seed seed=em.find(Seed.class, sid);
			if(seed==null) {
				throw new NoRecordFoundException("No seed with id present");
			}
			Planter plt=em.find(Planter.class,plid);
			if(plt==null){
				throw new NoRecordFoundException("No planter with id present");
			}
			Set<Plant> plant1=new HashSet<>();
			plant1.add(plant);
			Set<Seed>  seed1=new HashSet<>();
			seed1.add(seed);
			
			plt.setSeed(seed1);
			plt.setPlant(plant1);
			
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(plt);
			et.commit();
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Please try again later");
		}finally {
			em.close();
		}
		
	}

}
