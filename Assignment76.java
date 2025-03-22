package Javaassignments;

import java.util.Scanner;

public class Assignment76 {

	public static void main(String[] args) {
		// WAP to accept the values of your array at run time
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		
		int num[] = new int[sc.nextInt()];
		
		for(int i=0; i<=num.length; i++)
		{
		
		System.out.println("Enter the values");
		num[i] = sc.nextInt();
		
	}
	}
}
