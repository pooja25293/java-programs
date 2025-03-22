package Javaassignments;

import java.util.Arrays;

public class Assignment82 {

	public static void main(String[] args) {
		// WAP to find out if the given 2 strings are anagram  
		//rearranging the same letter with same length and same charter
		
		String str1 = "cat";
		String str2 = "uict";
		
		//chcel length
		if(str1.length()!=str2.length()) {
			System.out.println("They are not anagram");
		}
		else
		{
			System.out.println("They are anagram");	
		}
		
		//convert to charc
		
	          char [] c1 = str1.toCharArray();  //[c,a,t]
	          char [] c2 =  str2.toCharArray();   //[a,c,t]
	        
	          //Ascending order char
	          Arrays.sort(c1);
	          Arrays.sort(c2);
	          
	     //
	        boolean b1 =  Arrays.equals(c1, c2);
	        System.out.println(b1);
	       if( b1 == true) {
	    	   System.out.println("it is anagram");
	       }
	       else {
	    	   System.out.println("it is not anagram");
	       }
	       
	
		
		

	}

}
