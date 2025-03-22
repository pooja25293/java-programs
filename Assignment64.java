package Javaassignments;
//WAP on finally keyword concept 
public class Assignment64 {

	public static void main(String[] args) {
		try {
			int k = 1/0;
			}
			catch (ArithmeticException a1 )
			{
				System.out.println("Handle it");
			}
			 finally {
				 System.out.println("Handle it finalaly");
			 }
	}

}
