package Javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment103 {

	public static void main(String[] args) {
		// WAP to fetch all the values present in map
		
		Map<Integer,String> mo = new HashMap<Integer,String>();
		mo.put(11, "Phinpay");
		mo.put(12, "gpay");
		mo.put(13, "razorpay");
		mo.put(14, "simpleypay");
		
		for (String st : mo.values())// .values method it's retun type is [Collection  <String>[collection of string
		{
			System.out.println(st);
		}
		

	}

}
