package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
        	System.out.println(CC.BLACK_UNDERLINED+CC.GREEN_BOLD+"Welcome TO Green Leaf Nursery !"+CC.RESET);
        	System.out.println("1.Admin Login.");
        	System.out.println("2.Customer Login.");
        	System.out.println("3.Customer SignUp.");
        	System.out.print(CC.BLACK_BOLD+"Enter Selection:-"+CC.RESET);
        	
        	try {
        		choice =sc.nextInt();
        		switch(choice) {
            	case 1:
            		Admin.adminLogin(sc);
            		break;
            	case 2:
            		
            		break;
            	case 3:
            		break;
            	default:
            		System.out.println(CC.RED_BOLD+"Please Enter Correct Option."+CC.RESET);
        		}
        	}catch(InputMismatchException Ex) {
        		System.out.println(CC.RED_BOLD_BRIGHT+"Please Enter Correct Value In Range Of 1 To 3."+CC.RESET);
        		
        	}
        	
        	
        }while(choice!=0);
        sc.close();
        
        
        }   
}
