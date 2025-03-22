package Javaassignments;
//WAP on Multi Level Inheritance
class parentclassone {

	 static void addition() {
		System.out.println("add");
	}
}

class parentclastwo extends parentclassone{

	 static void sub() {
		System.out.println("sub");
	}
}

public class Assignment40 extends parentclastwo {
	static void multi() {
		System.out.println("multi");
	}

	public static void main(String[] args) {
		
		
		addition();
		sub();
		multi();
	

	}

}