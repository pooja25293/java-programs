package Javaassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment105 {

	public static void main(String[] args) {
		// WAP to iterate a MAP using Iterator

		
		Map<Integer,String> mo = new HashMap<Integer,String>();
		mo.put(11, "Phinpay");
		mo.put(12, "gpay");
		mo.put(13, "razorpay");
		mo.put(14, "simpleypay");
		
		Set <Entry <Integer, String>> s1=mo.entrySet();
		
		Iterator <Entry <Integer, String>> s2= s1.iterator();
		
		while(s2.hasNext()) {
			System.out.println(s2.next());
		}
		
		
	}

}
