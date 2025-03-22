package Javaassignments;


//WAP on This Keyword

public class Assignment47 {
 //Global variable 
	String name;
	int age;
	char c;
	Double d;
	
	void localvariable(String name,int age,char c,Double d) {
		////local variable
		this.name=name;
		this.age=age;
		this.c=c;
		this.d=d;
		
		
		
	}

	
	public static void main(String[] args) {
		Assignment47 s7 = new Assignment47();
		s7.localvariable("Priya", 90, 'T', 6.3);
		System.out.println(s7.name);
		System.out.println(s7.age);
		System.out.println(s7.c);
		System.out.println(s7.d);
		

	}

}
