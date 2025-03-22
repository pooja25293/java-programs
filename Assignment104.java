package Javaassignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment104 {

	public static void main(String[] args) {
		// WAP to fetch both keys&values present in map
		Map<Integer,String> mo = new HashMap<Integer,String>();
		mo.put(11, "Phinpay");
		mo.put(12, "gpay");
		mo.put(13, "razorpay");
		mo.put(14, "simpleypay");
		
		for(Entry<Integer, String> in : mo.entrySet()){
			System.out.println(in);
			
		}

	}

}
