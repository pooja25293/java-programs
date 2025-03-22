package Javaassignments;

public class Assignment84 {

	// WAP on string functions using replace, replaceAll, substring, matches, repeat
	
	
	
	
	public static void main(String[] args) {
		
		String str = "Pooja 11sadafule 5is the 9name of person";
		// it will  return from that index which beiginning index to the last index(Single paramter)
		System.out.println(str.substring(7));
		// it will  return from that index which beiginning index to the (last index mentioned -1)(Double paramter)
		System.out.println(str.substring(3, 9));
		
		System.out.println(str.replace('o', 'k'));
		
		//char of sequence replaces
		System.out.println(str.replace("sada","kool"));
		
		//regex
		System.out.println(str.replaceAll("[A-Z]", ""));
		
		//regex
		System.out.println(str.replaceAll("[a-z]", ""));
		
		//regex
		System.out.println(str.replaceAll("[0-9]", ""));
		
		//matches concept
		
		String st2 = "Alan";
		boolean b1 =st2.matches("....");
		boolean b7 =st2.matches("...");
		System.out.println(b1);
		System.out.println(b7);
		
		//(.)* --Multi char--so it will check ir=t ends with 'n' or not
		boolean b2 =st2.matches("(.)*n");
		System.out.println(b2);
		
		//(.)* --Multi char--so it will check ir=t starts with 'A' or not
		boolean b4 =st2.matches("A(.)*");
		System.out.println(b4);
		
		
		//Check given string have man
		
		String name = "Salman ";
		boolean b5 =name.matches("(.)*man(.)*");
		System.out.println(b5);
		
		String n = name.repeat(3);
		System.out.println(n);
		
		 
		
		
	}

}
