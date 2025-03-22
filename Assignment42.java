package Javaassignments;
//WAP on super calling statement using non-parameterized super calling statement

class one{
	
	one(){
		System.out.println("one");
	}
}


public class Assignment42 extends one{
	
	
	 
	Assignment42(){
		//super
		System.out.println("two");
	}

	public static void main(String[] args) {
		
		new Assignment42();

	}

}
