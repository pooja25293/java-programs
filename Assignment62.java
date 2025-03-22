package Javaassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

//WAP on Exception handling using nested try catch keywords
public class Assignment62 {

	public static void main(String[] args) {
		
		try {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Print age");;
		  int age = sc.nextInt();
	
			}
		  catch(InputMismatchException a6)
		  {
			  try {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Print age in no");;
			  int age = sc.nextInt();
			  }
			  catch(InputMismatchException a61)
			  {
				  System.out.println("Print age in no");;
			  }
			  }
		  }
	}

		 
	


