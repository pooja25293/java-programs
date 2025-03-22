package Javaassignments;
// WAP on SIB and IIB
public class Assignment60 {

	//static initilization block
	static{
		System.out.println("static intialize block 1");
	}
	
	static{
		System.out.println("static intialize block 2");
	}
	
	static{
		System.out.println("static intialize block 3");
	}
	
	//instance initilization block
	{
		System.out.println("instance intialize block 1");
	}
	{
		System.out.println("instance intialize block 2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		new Assignment60();
		

	}

}
