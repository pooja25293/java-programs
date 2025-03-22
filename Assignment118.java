package Javaassignments;

public class Assignment118 {

	
		// WAP on Compile time polymorphism (Method overloading)
		void display(int num) {
	        System.out.println("Integer value: " + num);
	    }

	    // Overloaded method with two parameters
	    void display(int num, double decimal) {
	        System.out.println("Integer value: " + num + ", Double value: " + decimal);
	    }

	    // Overloaded method with a different parameter type
	    void display(String message) {
	        System.out.println("Message: " + message);
	    }

	    public static void main(String[] args) {
	        // Creating an object of the class
	    	Assignment118 obj = new Assignment118();

	        // Calling overloaded methods
	        obj.display(10);                // Calls method with one int parameter
	        obj.display(25, 3.14);           // Calls method with int and double parameters
	        obj.display("Hello, Java!");     // Calls method with a String parameter
	    }
	}
	
