package Javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment101 {

	public static void main(String[] args) {
		// WAP on MAP using methods like get(), containsKey(), containsValue(), putIfAbsent(), equals()
		
		Map<Integer,String> mo = new HashMap<Integer,String>();
		mo.put(11, "Phinpay");
		mo.put(12, "gpay");
		mo.put(13, "razorpay");
		mo.put(14, "simpleypay");
		mo.putIfAbsent(20, "simpleypay");
		String  s=mo.get(12);
		System.out.println(s);
		
		for (String st : mo.values())// .values method it's retun type is [Collection  <String>[collection of string
		{
			System.out.println(st);
		}
		
		
		Map<Integer,String> md = new HashMap<Integer,String>();
		md.put(11, "Phinpay");
		md.put(12, "gpay");
		md.put(13, "razorpay");
		md.put(14, "simpleypay");
		
		
		boolean b1 = mo.containsKey(13);
		System.out.println(b1);
		
		
		boolean b2=mo.containsValue("amazonpay");
		System.out.println(b2);
		
		boolean b3 = mo.equals(md);
		System.out.println(b3);
		
		
		
	}

}
