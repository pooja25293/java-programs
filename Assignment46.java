package Javaassignments;


//WAP on Super Keyword

class Partensts{
	
	void login() {
		System.out.println("method overiding is sucessfull");
	}
	
}

public class Assignment46 extends Partensts {

	void login() {
		super.login();
		System.out.println("method overiding");
	}
	
	public static void main(String[] args) {
		Assignment46 s1 = new Assignment46();
		s1.login();
	}

}
