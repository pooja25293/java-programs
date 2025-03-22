package Javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment99 {

	public static void main(String[] args) {
		// WAP on MAP concepts using its methods

		Map<Integer,String>m1 =new HashMap<Integer,String>();
		m1.put(113, "Pjone");
		m1.put(173, "njkkajf");
		m1.put(153, "jhcu");
		//m.putAll(m1);
	
		//m1.remove(1123);
		//m1.remove(173, "njkkajf");
		//m1.clear();
		
		boolean b1 =m1.isEmpty();
		System.out.println(b1);
		m1.replace(153, "jhcu", "India");
		m1.replace(113, "one");
		System.out.println(m1);
	}

}
