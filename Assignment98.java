package Javaassignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment98 {

	public static void main(String[] args) {
		// WAP to store account number, account holder name inside Map
		//by passing the values at runtime for both account number, account holder
       
		Map<Integer,String>m =new HashMap<Integer,String>();
		m.put(1123, "Pooja");
		m.put(1673, "Raju");
		m.put(1543, "Kam");
		System.out.println(m);

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
