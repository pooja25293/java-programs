package Javaassignments;

public class Assignment72 {

	public static void main(String[] args) {
		// WAP on basic concepts of Array also use try and catch to handle ArrayIndexOutOfBounds Exception
		
		try {
		int num[] = new int [4];
		num[0] = 1;
		num[1] = 11;
		num[2] =22;
		num[3] = 33;
		num[4] = 44;
	}
		catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("Handle it");
		}

	}
}
