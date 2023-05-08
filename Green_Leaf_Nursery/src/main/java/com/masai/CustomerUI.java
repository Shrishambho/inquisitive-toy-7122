package com.masai;

import java.util.Scanner;

import com.masai.DAO.CustomerDAO;
import com.masai.DAO.CustomerDAOImpl;
import com.masai.Entity.Address;
import com.masai.Entity.Customer;
import com.masai.Exception.SomeThingWentWrongException;

public class CustomerUI {

	

	static void addCustomer(Scanner sc) {
		System.out.print("Enter Name:-");
		String name=sc.next();
		
		System.out.print("Enter UserName:-");
		String username=sc.next();
		
		System.out.print("Enter PassWord:-");
		String password=sc.next();
		
		System.out.print("Enter city name:-");
		String city=sc.next();
		
		System.out.print("Enter state name:-");
		String state=sc.next();
		
		System.out.print("Enetr zip code:-");
		int zip=sc.nextInt();
		
		Address address=new Address(city,state,zip);
		
		Customer customer=new Customer(name,username,password,address);
		
		try {
			CustomerDAO cus=new CustomerDAOImpl();
			cus.addCustomer(customer);
			System.out.println("Customer added successfully.");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
