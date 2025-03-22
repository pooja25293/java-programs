package Javaassignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment96 {

	public static void main(String[] args) {
		// WAP to iterate a Set using Iterator
		Set <Integer>s1 =	new HashSet<Integer>();
	     s1.add(53);
		s1.add(56);
		s1.add(89);
		s1.add(null);
		System.out.println(s1);
		Iterator <Integer> s2 = s1.iterator();
		
		while(s2.hasNext()) {
			System.out.println(s2.next());
			
		}

	}

}
