package Javaassignments;

import java.util.Arrays;

//WAP to copy one array into another array
public class Assignment78 {

	public static void main(String[] args) {
		
		int array1[] = new int[3];
		array1[0] = 43;
		array1[1] = 73;
		array1[2] = 33;
		
		
		int array2[] = new int[array1.length];
		
		for (int i =0;i< array1.length;i++)
		{
			array2[i]  = array1[i] ;
		}
		
		System.out.println("array1 -->" + Arrays.toString(array1));
		System.out.println("array2 -->" + Arrays.toString(array2));
	}

}
