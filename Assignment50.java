package Javaassignments;
//WAP on Abstract Class with both Abstract and Concrete methods
abstract class webtable{
	abstract void methodnine();
	abstract void methodelven();
	
	static void erase() {
		
	}
	void rearrange() {
		
	}
}
public class Assignment50 extends webtable{

	public static void main(String[] args) {
		Assignment50 f6 = new Assignment50();
		f6.methodnine();
		f6.methodelven();
		
	}

	
	void methodnine() {
	System.out.println("Hide implemenatation");
		
	}


	void methodelven() {
		
	}

	
}
