package Javaassignments;


//WAP to avoid Method Overiding using Final Method

class account{
	
	final void login() {
		System.out.println("method overiding is sucessfull");
	}
	
}

public class Assignment48 extends account {

	void login_with_mail() {
		//super.login();
		System.out.println("method overiding");
	}
	
	public static void main(String[] args) {
		Assignment48 s1 = new Assignment48();
		s1.login();
	}

}