package Javaassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment89 {

	public static void main(String[] args) {
		// WAP on collection concept with the help of Upcasting on Different Data types (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.
		
		
		//upcasting
		Collection c1 = new ArrayList();
		//C1 is object so you can any data type
		System.out.println(c1.add("pooja"));
		c1.add(123);
		c1.add('A');
		
		Collection <Integer> c2= new ArrayList<Integer>();
		 c2.add(67);
		c2.add(77);
		c2.add(99);
		 
		c2.remove(67);
		System.out.println("before removing -->"  + c2);
		System.out.println("After removing -->"  + c2);
		
		c2.addAll(c2);
		System.out.println("before removing  all -->"  + c2);
		c2.removeAll(c2);
		System.out.println("After removing all -->"  + c2);
		
		System.out.println(c2.contains(55));
		
		
		Collection <Double> c3= new ArrayList<Double>();
		 c3.add(89.5);
		boolean bu = c3.isEmpty();
		System.out.println(bu);
		
		
		boolean v = c2.containsAll(c3);
		System.out.println(v);
	}

}
