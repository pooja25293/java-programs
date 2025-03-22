package Javaassignments;
//WAP on Multiple Level Inheritance 
interface cartadding{
	void fify();
	void sixty();
	
}

interface cartremove {
	void seventy();
	void Eighty();
	
}
public class Assignment53 implements cartadding, cartremove{

	public static void main(String[] args) {
		Assignment53 k = new Assignment53();
		k.seventy();

	}



	public void seventy() {
		System.out.println("Multiple Level Inheritance");
		
	}

	
	public void Eighty() {
		// TODO Auto-generated method stub
		
	}

	
	public void fify() {
		// TODO Auto-generated method stub
		
	}

	
	public void sixty() {
		// TODO Auto-generated method stub
		
	}
}
