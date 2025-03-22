package Javaassignments;
//WAP on Abstract Class and Abstract Method

abstract class lastwone{
	abstract void methodone();
	abstract void methodtwo();
	
}

abstract class Twwo extends lastwone{
	abstract void methodfour();
	abstract void methodtthree();
	
}
public class Assignment49 extends Twwo{

	public static void main(String[] args) {
		Assignment49 f1 = new Assignment49();
		f1.methodfour();
		
	}

	
	void methodfour() {
		System.out.println("Login feature");
		
	}

	
	void methodtthree() {
		// TODO Auto-generated method stub
		
	}


	void methodone() {
		// TODO Auto-generated method stub
		
	}

	void methodtwo() {
		// TODO Auto-generated method stub
		
	}

}
