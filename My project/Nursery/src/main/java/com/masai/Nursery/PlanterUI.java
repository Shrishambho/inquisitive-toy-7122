package com.masai.Nursery;

import java.util.List;
import java.util.Scanner;

import com.masai.DAO.PlantDAO;
import com.masai.DAO.PlantDAOImpl;
import com.masai.DAO.PlanterDAO;
import com.masai.DAO.PlanterDAOImpl;
import com.masai.Entity.Plant;
import com.masai.Entity.Planter;
import com.masai.Exception.SomeThingWentWrongException;
import com.masai.Exception.NoRecordFoundException;
public class PlanterUI {

	static void addPlanter(Scanner sc) {

        System.out.print("Enter Planter Height:-");
		double height=sc.nextDouble();
		System.out.print("Enter Planter Capacity:-");
		int capacity=sc.nextInt();
		System.out.print("Enter Planter drinageHoles:-");
		int drinageHoles=sc.nextInt();
		System.out.print("Enter Planter Color:-");
		String color=sc.next();
		System.out.print("Enter Planter Shape:-");
		String shape=sc.next();
		System.out.print("Enter Planter Stock:-");
		int stock=sc.nextInt();
		System.out.print("Enter Planter Cost:-");
		double cost=sc.nextDouble();
		
		Planter planter=new Planter(height,capacity,drinageHoles,color,shape,stock,cost,null,null,null);
		
		try {
			PlanterDAO plan=new PlanterDAOImpl();
			plan.addPlanter(planter);
			System.out.println("Planter added successfully.");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	static void updatePlanter(Scanner sc) {
		System.out.print("Enter plant id:-");
		int pid=sc.nextInt();
		System.out.print("Enter seed id:-");
		int sid=sc.nextInt();
		System.out.print("Enter planter id:-");
		int planterid=sc.nextInt();
		
		try {
			PlanterDAO plt=new PlanterDAOImpl();
			plt.updatePlanter(pid, sid, sid);
			System.out.println("Planter updated succeefully.");
		}catch(SomeThingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	static void getPlanter() {
		try {
			PlanterDAO pl=new PlanterDAOImpl();
			List<Planter> list=pl.getAllPlanters();
			list.forEach(i->System.out.println("Planter id:-"+i.getPlanterId()+"Planter Height:- "+i.getHeight()+"Planters Drinage Holes "+i.getDrinageHoles()+"Planters capacity:-"+i.getCapacity()+
					"Planters cost:-"+i.getPlanterCost()));
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
}
