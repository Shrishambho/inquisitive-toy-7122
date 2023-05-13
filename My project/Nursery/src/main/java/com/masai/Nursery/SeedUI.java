package com.masai.Nursery;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.masai.DAO.SeedDAO;
import com.masai.DAO.SeedDAOImpl;
import com.masai.Entity.Planter;
import com.masai.Entity.Seed;
import com.masai.Exception.SomeThingWentWrongException;

public class SeedUI {

static void addSeed(Scanner sc) {
		
		
		System.out.print("Enter seed name:-");
		String commonName=sc.next();
		
		System.out.print("Enter type of seed medicine or ordinary:-");
		String typeOfPlant=sc.next();
		System.out.print("Enter description:-");
		String plantDescription=sc.next();
		System.out.print("Enter seed stock:-");
		int plantStock=sc.nextInt();
		System.out.print("Enter cost per seed:-");
		double cost=sc.nextDouble();
		System.out.print("Enter seeds per packet:-");
		int quantity=sc.nextInt();
		
		
		Seed sd=new Seed(commonName,typeOfPlant,plantDescription,plantStock,cost,quantity,null);
		
		try {
			SeedDAO seedDAO=new SeedDAOImpl();
			seedDAO.addSeed(sd);
			System.out.println("Seed Added Successfully.");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}

static void getSeed() {
	try {
		SeedDAO sd=new SeedDAOImpl();
		List<Seed> list=sd.getAllSeeds();
		list.forEach(i->System.out.println("Id:- "+i.getSeedId()+" Seed Name:- "+i.getSeedName()+
		" description:-"+i.getDescription()+" cost:- "+i.getCost()+" seeds Per packet:- "+i.getSeedsPerPacket()));
		
	}catch(SomeThingWentWrongException ex) {
		System.out.println(ex.getMessage());
	}
}

}
