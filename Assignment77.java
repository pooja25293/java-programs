package Javaassignments;

import java.util.Arrays;

public class Assignment77 {

	public static void main(String[] args) {
		// ///WAP to check if 2 arrays are equals to each other at run time
		
		
		String name [] = new String [3];
		name[0] = "Ram";
		name[1] = "sham";
		name[2] = "Ramkarn";
		
		
		String name1 [] = new String [3];
		name1[0] = "Ram";
		name1[1] = "sham";
		name1[2] = "Ramkarn";
		
		boolean ans = Arrays.equals(name, name1);
		System.out.println(ans);
	}

}
