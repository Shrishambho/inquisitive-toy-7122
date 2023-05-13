package com.masai.UI;

import java.util.List;
import java.util.Scanner;

import com.masai.DAO.CustomerDAO;
import com.masai.DAO.CustomerDAOImpl;
import com.masai.DAO.PlantDAO;
import com.masai.DAO.PlantDAOImpl;
import com.masai.Entity.Customer;
import com.masai.Entity.Plant;
import com.masai.Exception.SomeThingWentWrongException;

public class PlantUI {

	public static void addPlant(Scanner sc) {
		System.out.print("Enter height:-");
		int plantHeight=sc.nextInt();
		System.out.print("Enter plant spread:-");
		String plantSpread=sc.next();
		System.out.print("Enter common name:-");
		String commonName=sc.next();
		System.out.print("Enetr bloom time:-");
		String bloomTime=sc.next();
		System.out.print("Enter type of use is medicine or ordinary:-");
		String medicineOrOrdinaryUse=sc.next();
		System.out.print("Enter difficultyLevel:-");
		String difficultyLevel=sc.next();
		System.out.print("Enter Temperature:-");
		String temperature=sc.next();
		System.out.print("Enter type of plant:-");
		String typeOfPlant=sc.next();
		System.out.print("Enter description:-");
		String plantDescription=sc.next();
		System.out.print("Enter plant stock:-");
		String plantStock=sc.next();
		System.out.print("Enter cost per plant:-");
		double cost=sc.nextDouble();
		
		Plant plant=new Plant(plantHeight,plantSpread,commonName,bloomTime,medicineOrOrdinaryUse,difficultyLevel,temperature
				,typeOfPlant,plantDescription,plantStock,cost);
		
		
		
		
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
			list.forEach(i->System.out.println("Plant ID:- "+i.getPlantId()+" Name :-"+i.getCommonName()+" cost :-"+i.getCost()+" Available stock :-"+i.getPlantStock()+""));
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
