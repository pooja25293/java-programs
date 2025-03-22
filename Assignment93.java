package Javaassignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment93 {

	public static void main(String[] args) {
		// WAP to iterate a List using Iterator
		List<String> L1 = new ArrayList<String>();
		L1.add("Pooja");
		L1.add("Rani");
		L1.add("ZENDU");
		L1.add("Sadafule");
		L1.add("Vaish");

		System.out.println("Itertion  started :");

		Iterator<String> L2 = L1.iterator();
		while (L2.hasNext()) {
			System.out.println(L2.next());

		}

		
		
		

	}
}