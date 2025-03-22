package Javaassignments;
import java.util.Enumeration;
import java.util.Vector;
public class Assignment100 {

	public static void main(String[] args) {
		// WAP on Enumeration
		
		        // Creating a Vector
		        Vector<String> fruits = new Vector<>();
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");
		        fruits.add("Mango");

		        // Creating Enumeration to traverse elements
		        Enumeration<String> enumeration = fruits.elements();

		        // Iterating using Enumeration
		        System.out.println("Fruits List:");
		        while (enumeration.hasMoreElements()) {
		            System.out.println(enumeration.nextElement());
		        }
		    }
		}

