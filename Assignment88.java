package Javaassignments;

public class Assignment88 {

	
	// WAP on constructors of a String Buffer and constructors of a String Builder
	
	public static void main(String[] args) {
		
		
		        // Constructors of StringBuffer
		        StringBuffer sb1 = new StringBuffer(); // Default capacity (16 chars)
		        StringBuffer sb2 = new StringBuffer("Hello"); // Initializing with a string
		        StringBuffer sb3 = new StringBuffer(50); // Custom capacity of 50 chars

		        System.out.println("StringBuffer Examples:");
		        System.out.println("sb1 (default): " + sb1.capacity()); // Default capacity 16
		        System.out.println("sb2 (initialized with 'Hello'): " + sb2);
		        System.out.println("sb3 (custom capacity 50): " + sb3.capacity());

		        // Constructors of StringBuilder
		        StringBuilder sb4 = new StringBuilder(); // Default capacity (16 chars)
		        StringBuilder sb5 = new StringBuilder("World"); // Initializing with a string
		        StringBuilder sb6 = new StringBuilder(30); // Custom capacity of 30 chars

		        System.out.println("\nStringBuilder Examples:");
		        System.out.println("sb4 (default): " + sb4.capacity()); // Default capacity 16
		        System.out.println("sb5 (initialized with 'World'): " + sb5);
		        System.out.println("sb6 (custom capacity 30): " + sb6.capacity());
		
	}

}
