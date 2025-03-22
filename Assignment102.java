package Javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment102 {

	public static void main(String[] args) {
		// WAP to fetch all the keys present in map
		
		
		Map<Integer,String> mo = new HashMap<Integer,String>();
		mo.put(11, "Phinpay");
		mo.put(12, "gpay");
		mo.put(13, "razorpay");
		mo.put(14, "simpleypay");
		
		
		for(int i : mo.keySet())//Set <Integer>--keyset return type is set of object so we are going itertae each keay so we using for loop
			
		{
			System.out.println(i);
		}
	}

}
