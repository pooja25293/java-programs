package Javaassignments;

import java.util.Arrays;

//WAP to copy one array into another array in reverse order
public class Assignment79 {

	public static void main(String[] args) {
		int array1[] = new int[4];
		array1[0] = 8;
		array1[1] = 73;
		array1[2] = 33;
		array1[3] = 98;
		
		int reverse[] = new int[array1.length];
		
		for (int i =0, j=3;  i<=array1.length-1;   i++,j--)
		{
			reverse[j]  = array1[i] ;
		}
		
		System.out.println("array1 -->" + Arrays.toString(array1));
		System.out.println("array2 -->" + Arrays.toString(reverse));
	}
	

	}


