package com.masai.Nursery;

import java.util.Scanner;

import com.masai.DAO.OrderDAO;
import com.masai.DAO.OrderDAOImpl;
import com.masai.Exception.SomeThingWentWrongException;

public class OrderUI {

	static void placeOrder(Scanner sc) {
		System.out.print("Enter plantId:-");
		int pid=sc.nextInt();
		System.out.print("Enter seedId:-");
		int sid=sc.nextInt();
		System.out.print("Enter PlanterId:-");
		int planterId=sc.nextInt();
		
		try {
			OrderDAO od=new OrderDAOImpl();
			od.placeOrder(pid, sid, planterId);
			System.out.println("order placed scuccessfully");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
