package Javaassignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment91 {

	// WAP to iterate a Collection using Iterator
	public static void main(String[] args) {
		
		

		Collection c11 = new ArrayList();
		//C1 is object so you can any data type
		c11.add("NAJJS");
		c11.add(123);
		c11.add('A');
		
		Iterator it =	c11.iterator();
		
		while(it.hasNext()) { //it will check the condition that it next element is prensent ot not(return type is true of false)
			
			System.out.println(it.next());
		}
		
		//hasnext -return type is boolean
		


	}

}
