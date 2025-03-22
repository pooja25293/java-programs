package Javaassignments;
//WAP on method overriding

class parent{
	
	void login() {
		System.out.println("method overiding is sucessfull");
	}
	
}

public class Assignment45 extends parent {

	void login() {
		System.out.println("method overiding");
	}
	
	public static void main(String[] args) {
		Assignment45 s1 = new Assignment45();
		s1.login();
	}

}
