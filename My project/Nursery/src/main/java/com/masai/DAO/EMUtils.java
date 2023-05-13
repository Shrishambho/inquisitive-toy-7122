package com.masai.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtils {

	private static EntityManagerFactory emf;
	static {
		
			emf=Persistence.createEntityManagerFactory("greenConnect");	
		
	}
	
	public static EntityManager getEntityManager() {
      return emf.createEntityManager();
	}
}
