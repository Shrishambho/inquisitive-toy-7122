package com.masai;

import java.util.Scanner;

import com.masai.DAO.SeedDAO;
import com.masai.DAO.SeedDAOImpl;
import com.masai.Entity.Seed;
import com.masai.Exception.SomeThingWentWrongException;

public class SeedUI {

	static void addSeed(Scanner sc) {
		
		
		System.out.print("Enter common name:-");
		String commonName=sc.next();
		System.out.print("Enetr bloom time:-");
		String bloomTime=sc.next();
		System.out.print("Watering required:-");
		String watering=sc.next();
		System.out.print("Enter difficultyLevel:-");
		String difficultyLevel=sc.next();
		System.out.print("Enter Temperature:-");
		String temperature=sc.next();
		System.out.print("Enter type of seed:-");
		String typeOfPlant=sc.next();
		System.out.print("Enter description:-");
		String plantDescription=sc.next();
		System.out.print("Enter seed stock:-");
		String plantStock=sc.next();
		System.out.print("Enter cost per seed:-");
		double cost=sc.nextDouble();
		System.out.print("Enter seeds per packet:-");
		int quantity=sc.nextInt();
		
		
		Seed sd=new Seed(commonName,bloomTime,watering,difficultyLevel,temperature,typeOfPlant,plantDescription,plantStock,cost,quantity);
		
		try {
			SeedDAO seedDAO=new SeedDAOImpl();
			seedDAO.addSeed(sd);
			System.out.println("Seed Added Successfully.");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
