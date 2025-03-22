package Javaassignments;
//WAP on Single Level Inheritance

class parentclass {

	 static void addition() {
		System.out.println("add");
	}
}

public class Assignment39 extends parentclass {
	static void multi() {
		System.out.println("multi");
	}

	public static void main(String[] args) {
		
		
		addition();
		multi();
	
 
	}

}