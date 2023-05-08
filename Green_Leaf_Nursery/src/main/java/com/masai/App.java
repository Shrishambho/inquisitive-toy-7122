package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println(CC.GREEN_BOLD_BRIGHT+"Welcome To Green Leaf Nursey!"+CC.RESET);
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
        	System.out.println("1.Admin Login.");
        	System.out.println("2.Customer Login.");
        	System.out.println("3.Customer Registration.");
        	System.out.println("0.Exit");
        	System.out.print(CC.BLACK_BOLD+"Enter Selection:-"+CC.RESET);
        	try {
        		choice = sc.nextInt();
        		
        		switch(choice) {
        		case 1:
        			Admin.adminLogin(sc);
        			break;
        		case 2:
        			break;
        		case 3:
        			CustomerUI.addCustomer(sc);
        			break;
        		case 0:
        			break;
        		default:
        			System.out.println(CC.ORANGE+"Please choose correct option"+CC.RESET);
        		}
        		
        	}catch(InputMismatchException ex) {
        		System.out.println(CC.RED_BOLD_BRIGHT+"Please Enter Integer value From 0 to 3"+CC.RESET);
        	}
        	
        	
        	
        	
        	
        	
        }while(choice != 0);
        
    }   
}
