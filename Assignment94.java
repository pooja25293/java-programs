package Javaassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment94 {

	public static void main(String[] args) {
		// WAP to iterate a List using List iterator

		// WAP to iterate a List using Iterator
				List<String> L1 = new ArrayList<String>();
				L1.add("Pooja");
				L1.add("Rani");
				L1.add("ZENDU");
				L1.add("Sadafule");
				L1.add("Vaish");

				System.out.println("Itertion  started :");
				
				System.out.println("Forward iterator");
				
				ListIterator <String> L3 = L1.listIterator();
				
				while(L3.hasNext()) {
					System.out.println(L3.next());	
				}
				System.out.println("Backward iterator");
		        
				while(L3.hasPrevious()) {
					System.out.println(L3.previous());	
				}

	}

}
