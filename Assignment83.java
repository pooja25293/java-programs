package Javaassignments;

import javax.xml.stream.events.Characters;

public class Assignment83 {

	public static void main(String[] args) {
		// WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String 
		
		
		String str = "Pooja& ^ % is to 26 # @";
		
		int count_of_aplha = 0;
		int count_of_digit = 0;
		int count_of_space = 0;
		
		
		char ch [] = str.toCharArray(); //[P,o,o,j,a, ,i,s, ,t,o, ,2,6]
		
		for(int i =0; i<=ch.length-1;i++) {
		
			//Character is wrapper class  .//isAlphabetic -it is method to chcek alphabet present in 
		boolean b1 = Character.isAlphabetic(ch[i]);
		boolean b2 = Character.isDigit(ch[i]);
		boolean b3 = Character.isWhitespace(ch[i]);
		
		if(b1==true) {
			count_of_aplha ++;
		}
		if(b2==true) {
			count_of_digit ++;
		}
		if(b3==true) {
			count_of_space ++;

	}
		}//for loop end here
		
		int count_of_char = str.length()-(count_of_aplha + count_of_digit + count_of_space );
		System.out.println(count_of_char);
		
		System.out.println(count_of_aplha);
		System.out.println(count_of_digit);
		System.out.println(count_of_space);


	
	}
}

