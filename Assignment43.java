package Javaassignments;

//WAP on super calling statement using parameterized super calling statement
class login{
	
	login(String name,int age){
		System.out.println("logged in");
	}
}


public class Assignment43 extends login {
	

	
	Assignment43(){
		super ("Pooja", 26);
		System.out.println("logged out");
	}

	public static void main(String[] args) {
		
		new Assignment43();

	}

}
