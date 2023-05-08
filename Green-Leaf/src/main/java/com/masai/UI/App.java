package com.masai.UI;

import java.util.Scanner;



public class App 
{
	static void displayAdminMenu() {
		System.out.println("1.Add Plant.");
		System.out.println("2.Add Seed.");
		System.out.println("3.Add Planter");
		System.out.println("4.Update Plant");
		System.out.println("6.Update Seed.");
		System.out.println("7.Update Planter");
		System.out.println("8.View Plant.");
		System.out.println("9.View Seed.");
		System.out.println("10.View Planter");
		System.out.println("11.View Customers");
		System.out.println("12.Delete Plant");
		System.out.println("13.Delete Seed");
		System.out.println("14.Delete Planter.");
		System.out.println("15.Delete Order");
		System.out.println("0.LogOut");
	}
	static void adminMenu(Scanner sc) {
		int choice=0;
		do {
			displayAdminMenu();
			System.out.print("Enter Selection:-");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				PlantUI.addPlant(sc);
				break;
			case 2:
				SeedUI.addSeed(sc);
				break;
			case 3:
				 PlanterUI.addPlanter(sc);
				break;
			case 4:
               
				break;
			case 7:
				PlanterUI.updatePlanter(sc);
			case 0:
				System.out.println("Bye Bye Admin.");
				break;
			default:
				System.out.println("Please select correct option.");
			}
		}while(choice != 0);
	}
	
	
	
	static void adminLogin(Scanner sc) {
		System.out.print("Enter username:- ");
		String username = sc.next();
		System.out.print("Enter password:- ");
		String password = sc.next();
		if(username.equals("admin") && password.equals("admin")) {
			adminMenu(sc);
			System.out.println("Welcome admin");
		}else {
			System.out.println("Invalid Username of Password");
		}
	}
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
       do {
    	System.out.println("Welcome To Green Leaf Nursery!");
    	System.out.println("1.Admin Login.");
       	System.out.println("2.Customer Login.");
       	System.out.println("3.Customer Registration.");
       	System.out.println("0.Exit");
       	System.out.print("Enter Selection:-");
       	choice=sc.nextInt();
       	
       	switch(choice) {
       	case 1:
       		adminLogin(sc);
       		break;
       	case 2:
       		CustomerUI.customerLogin(sc);
       		break;
       	case 3:
       		CustomerUI.addCustomer(sc);
       		break;
       	case 0:
       		System.out.println("Thank You.");
       	}
       	
       }while(choice !=0);
        
        
    }
}
