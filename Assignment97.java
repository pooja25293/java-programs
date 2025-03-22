package Javaassignments;
import java.util.*;
public class Assignment97 {

	public static void main(String[] args) {
		// WAP to sort List
		
		        // Creating a List
		        List<String> fruits = new ArrayList<>();
		        fruits.add("Mango");
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");

		        // Sorting the List in Ascending Order
		        Collections.sort(fruits);
		        System.out.println("Sorted List (Ascending): " + fruits);

		        // Sorting the List in Descending Order
		        Collections.sort(fruits, Collections.reverseOrder());
		        System.out.println("Sorted List (Descending): " + fruits);
		    }
		

	}
	
	
	


