package Javaassignments;

public class Assignment71 {

	public static void main(String[] args) {
		// WAP to check if the given string is a Palindrome?

		
		 String str = "MOM";
		 String reverse = "";
			
		 for(int i = str.length()-1;i>=0;i--)
		 {
			 reverse = reverse +str.charAt(i);
		 }
		 
		 if(str.equals(reverse)) {
			 System.out.println("Palindrome  ");
		 }
		 else {
			 System.out.println("not Palindrome  ");
		 }
		 
	}

}
