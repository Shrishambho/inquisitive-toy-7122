package com.masai.Nursery;

import java.util.List;
import java.util.Scanner;

import com.masai.DAO.PlantDAO;
import com.masai.DAO.PlantDAOImpl;
import com.masai.Entity.Plant;
import com.masai.Exception.SomeThingWentWrongException;

public class PlantUI {

	public static void addPlant(Scanner sc) {
		
		System.out.print("Enter plant name:-");
		String commonName=sc.next();
		
		System.out.print("Enter type of use is medicine or ordinary:-");
		String medicineOrOrdinaryUse=sc.next();
		
		System.out.print("Enter description:-");
		String plantDescription=sc.next();
		System.out.print("Enter plant stock:-");
		int plantStock=sc.nextInt();
		
		System.out.print("Enter cost per plant:-");
		double cost=sc.nextDouble();
		
		Plant plant=new Plant(commonName,medicineOrOrdinaryUse,plantDescription,plantStock,cost,null);
		
		
		
		
		try {
			PlantDAO pt=new PlantDAOImpl();
			pt.addPlant(plant);
			System.out.println("Plant Added Successfully.");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	 }
	
	
	
	static void getPlant() {
		try {
			PlantDAO pl=new PlantDAOImpl();
			List<Plant> list=pl.getAllPlants();
			list.forEach(i->System.out.println("Id:- "+i.getPlantId()+" Name:- "+
			i.getPlantName()+" cost:- "+i.getCost()+" description:-"+i.getDescription()));
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
