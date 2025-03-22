package Javaassignments;
//WAP on Access specifiers within package for methods
public class Assignment55 {
	 public static  void open(){
		  System.out.println("this is public method");
	  }
	  
	 protected static  void close(){
		  System.out.println("this is protected method");
	  }
	  
	 
	 //default access modifier
	  static  void shutdown(){
		  System.out.println("this is default method");
	  }
	 
	
	 private static  void shutopen(){
		  System.out.println("this is private method");
	  }
	 
	public static void main(String[] args) {
		open();
		close();
		shutdown();
		shutopen();

	}

}
