package Javaassignments;
//WAP on Multi Level Inheritance using Interface Concept
interface cart{
	void methodtwnty();
	void methodtwntytwo();
	
}

interface cartadd extends cart{
	void methodtwntythree();
	void methodtwntyfour();
	
}
public class Assignment52 implements cartadd {

	public static void main(String[] args) {
		Assignment52 k11 = new Assignment52();
		k11.methodtwnty();

	}

	public void methodtwnty() {
	System.out.println("interface cocept");
	}

	
	public void methodtwntytwo() {
		// TODO Auto-generated method stub
		
	}


	public void methodtwntythree() {
		// TODO Auto-generated method stub
		
	}


	public void methodtwntyfour() {
		// TODO Auto-generated method stub
		
	}

	}