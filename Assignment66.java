package Javaassignments;
//WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario
public class Assignment66 {

	public static void main(String[] args) {
		
		        try {
		            // Two potential exceptions in one block
		            int a = 10, b = 0;
		            System.out.println("Dividing: " + (a / b)); // May cause ArithmeticException

		            int[] arr = {1, 2, 3};
		            System.out.println("Accessing: " + arr[5]); // May cause ArrayIndexOutOfBoundsException

		        } catch (ArithmeticException e) {
		            System.out.println("Cannot divide by zero.");
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index out of bounds.");
		        }

		        System.out.println("Program continues...");
		    }
		


	}

