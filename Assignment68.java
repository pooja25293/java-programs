package Javaassignments;

public class Assignment68 {

	public static void main(String[] args) {
		// Wap on String Function using concat and contains concept
		
		String firstname = "raju";
		String lastname = "Khasa";
		String schoolname = "MIT eduaction";
		System.out.println(firstname.concat(lastname));
		System.out.println(firstname.concat(" ").concat(schoolname).concat(" ").concat(lastname));
		
		//contains
		String Collagname = "Maharashtra Acadamy of Engg Aalndi";
		
		boolean b1 = Collagname.contains("Maharashtra");
		boolean b88 = schoolname.contains("Dypatil");

		System.out.println(b1);
		System.out.println(b88);
		
	}

}
