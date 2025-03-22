package Javaassignments;

public class Assignment115 {

	public static void main(String[] args) {
		// WAP to convert float into double
		
		float floatValue = 12.34f; // Example float value

        // Converting float to double (Implicit widening conversion)
        double doubleValue = floatValue;

        // Printing the values
        System.out.println("Float value: " + floatValue);
        System.out.println("Converted double value: " + doubleValue);
        
        
       // float (32-bit) → double (64-bit) conversion happens implicitly.
       // Since double has a larger precision, no explicit casting is needed.
       // The value remains the same, but double provides more precision

	}

}
