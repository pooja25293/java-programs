package Javaassignments;
//WAP on this calling statement

public class Assignment44 {
	
	Assignment44(){
		this("pooja");
		System.out.println("first");
	}
	
	
	Assignment44(String username){
		this('P');
		System.out.println("second");
	}
	
	Assignment44(char c){
		System.out.println("third");
	}
	public static void main(String[] args) {
		new Assignment44();
		
	}

}
