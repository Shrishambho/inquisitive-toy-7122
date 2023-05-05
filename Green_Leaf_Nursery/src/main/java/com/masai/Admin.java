package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {

	public static void showAdminMenu() {
		System.out.println(CC.BLUE_BOLD_BRIGHT+"1.Add Plant.");
		System.out.println("2.Update Plant.");
		System.out.println("3.Delete Plant.");
		System.out.println("4.View Plant.");
		System.out.println("5.Add Seed.");
		System.out.println("6.Update Seed.");
		System.out.println("7.Delete Seed.");
		System.out.println("8.View Seed.");
		System.out.println("9.Add Planter.");
		System.out.println("10.Update Planter.");
		System.out.println("11.Delete Planter.");
		System.out.println("12.View Planter.");
		System.out.println("13.View Customer.");
		System.out.println("14.Delete Customer.");
		System.out.println("0.Exit"+CC.RESET);
	}
	
	public static void adminMenu(Scanner sc) {
//		int choice=0;
//		
//		do {
//			
//			try {
//				showAdminMenu();
//				System.out.print(CC.BLACK_BOLD_BRIGHT+"Enter Selection:-"+CC.RESET);
//				choice =sc.nextInt();
//				switch(choice) {
//				case 1:
//					break;
//				case 2:
//					break;
//				case 3:
//					break;
//				case 4:
//					break;
//				case 5:
//					break;
//				default:
//					System.out.println(CC.ORANGE_BACKGROUND+"Please Enter correct option."+CC.RESET);
//				}
//			}catch(InputMismatchException ex) {
//				System.out.println(CC.RED_BOLD_BRIGHT+"Please Enetr an integer valur in range of 0-14"+CC.RESET);
//			}
//		}while(choice != 0);
		
		int choice=0;
		
		do {
			showAdminMenu();
			System.out.print(CC.BLACK_BOLD_BRIGHT+"Enter Selection:-"+CC.RESET);
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("shri");
				break;
			default:
				System.out.println("Please Enter correct option.");
				break;
			}
		}while(choice!=0);
		
		
	}
	public static void adminLogin(Scanner sc) {
		System.out.print("Enter Username:-");
		String username=sc.next();
		System.out.print("Enter Password:-");
		String password=sc.next();
		if(username.toLowerCase().equals("admin")&&password.toLowerCase().equals("admin")) {
			System.out.println(CC.GREEN_BOLD_BRIGHT+"Welcome Admin."+CC.RESET);
			adminMenu(sc);
		}
		else {
			System.out.println(CC.RED_BOLD_BRIGHT+"Invalid Username or Password."+CC.RESET);
		}
	}
}
