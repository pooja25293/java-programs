package Javaassignments;

import java.util.ArrayList;

import java.util.List;

public class Assignment92 {
	// WAP on List concepts using its methods
	public static void main(String[] args) {
		List<String> L1 = new ArrayList<String>();
		L1.add("Pooja");
		L1.add("Rani");
		L1.add("ZENDU");
		L1.add("Sadafule");
		L1.add("Vaish");
		L1.add(null);
		L1.add("Rani");
		
		//L1.add(0, "Priya");
		
		//Collections.sort(L1);
		System.out.println("After sorting--->"+ L1);
		
		List<String> L2 = new ArrayList<String>();
		L2.add("ANAY");
		L2.add("PHONEPA");
		L2.add("GPAY");
		L2.add("Pyatm");
		
		//L2.addAll(L1);
		//System.out.println(L2);
		L2.addAll(3, L1);
		//System.out.println(L2);


	}

}
