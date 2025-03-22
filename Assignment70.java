package Javaassignments;

public class Assignment70 {
	// WAP to reverse a string
	public static void main(String[] args) {
	 String str = "ananaya";
	 String reverse = " ";
	 
	 for(int i=str.length()-1;i>=0;i--)
	 {
		 char ch =str.charAt(i);
		 reverse = reverse + ch ;
	 }
	System.out.println(reverse);

	}

}
