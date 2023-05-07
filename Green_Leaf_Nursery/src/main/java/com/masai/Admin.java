package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {

	//1.Admin Login
	static void adminLogin(Scanner sc) {
		System.out.print("Enter username:-");
		String username=sc.next();
		System.out.print("Enetr password:-");
		String password=sc.next();
		
		if(username.toLowerCase().equals("admin")&&password.toLowerCase().equals("admin")) {
			System.out.println(CC.GREEN_BOLD_BRIGHT+"Welcome Admin"+CC.RESET);
			adminMenu(sc);
		}
		else {
			System.out.println(CC.RED_BOLD+"Incorrect Username or Password"+CC.RESET);
		}
	}
	
	//2.Admin Menu.
	
	static void adminMenu(Scanner sc) {
		int choice=0;
		do {
			
			try {
				displayAdminMenu();
				System.out.print("Enter Selection:-");
				choice =sc.nextInt();
				switch(choice) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					System.out.println(CC.ORANGE+"Please Enter Correct Option"+CC.RESET);
				}
			}catch(InputMismatchException ex) {
				System.out.println(CC.RED_BOLD_BRIGHT+"Please Enter An Integer Value."+CC.RESET);
				
			}
			
			
		}while(choice!=0);
		
		
	}
	
	
	//3. Display Admin
	static void displayAdminMenu() {
		System.out.println(CC.GREEN_BOLD+"1.Add Plant."+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"2.Add Seed."+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"3.Add Planter"+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"4.Update Plant"+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"6.Update Seed."+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"7.Update Planter"+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"8.View Plant."+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"9.View Seed."+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"10.View Planter"+CC.RESET);
		System.out.println(CC.GREEN_BOLD+"11.View Customers"+CC.RESET);
		System.out.println(CC.RED_BOLD+"12.Delete Plant"+CC.RESET);
		System.out.println(CC.RED_BOLD+"13.Delete Seed"+CC.RESET);
		System.out.println(CC.RED_BOLD+"14.Delete Planter."+CC.RESET);
		System.out.println(CC.RED_BOLD+"15.Delete Order"+CC.RESET);
		}
	
	
}
