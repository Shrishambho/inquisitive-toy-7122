package com.masai.DAO;

import java.util.HashSet;
import java.util.Set;

import com.masai.Entity.Customer;
import com.masai.Entity.LoggedInUserId;
import com.masai.Entity.Order;
import com.masai.Entity.Plant;
import com.masai.Entity.Planter;
import com.masai.Entity.Seed;
import com.masai.Exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void placeOrder(int plantId, int seedId, int planterId) throws SomeThingWentWrongException {
//	System.out.println(plantId);
//	System.out.println(seedId);
//	System.out.println(planterId);
	
	EntityManager em=null;
	try {
		em=EMUtils.getEntityManager();
		Plant plant=em.find(Plant.class, plantId);
		Seed seed=em.find(Seed.class, seedId);
		Planter planter=em.find(Planter.class, planterId);
		Customer cus=em.find(Customer.class, LoggedInUserId.loggedInUserId);
		
        Set<Seed> sd=new HashSet<>();
		sd.add(seed);
		
		Set<Plant> sd1=new HashSet<>();
		sd1.add(plant);
		
		planter.setIsBuyed(1);
		
		Set<Planter> pl=new HashSet<>();
		pl.add(planter);
		
		Order od=new Order();
		od.setCustomer(cus);
		od.setPlanter(pl);
	
		Planter plt=new Planter(planter.getHeight(),planter.getCapacity(),planter.getDrinageHoles(),planter.getPlanterColor(),planter.getPlanterShape(),planter.getPlanterStock(),planter.getPlanterCost(),sd1,sd,od);
		plt.setIsBuyed(1);
		Set<Order> od1=new HashSet<>();
		od1.add(od);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		cus.setOrder(od1);
		em.persist(plt);
		em.persist(od);
		et.commit();
		em.close();
	}catch(PersistenceException ex) {
		throw new SomeThingWentWrongException("something went wrong");
	}
	}

	
}
