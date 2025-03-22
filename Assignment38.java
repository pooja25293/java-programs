package Javaassignments;
//WAP on Inheritance Concept or Single Level Inheritance

class parentone {

	 void addition() {
		System.out.println("add");
	}
}

public class Assignment38 extends parentone {
	void multi() {
		System.out.println("multi");
	}

	public static void main(String[] args) {
		
		//create the child class object to call the method
		Assignment38 s1 = new Assignment38();
		s1.addition();
		s1.multi();
	
  
	}

}
