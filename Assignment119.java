package Javaassignments;


class Encap{
	 private String emailid = "pdsadafule@gmail.com";
	 
	 
		public String getEmailid() {
			return emailid;
		}


		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

}
public class Assignment119 {

	//WAP on Encapsulation
	
	//right click -source -->genrate getter and seetter
	

	public static void main(String[] args) {
		// WAP on Encapsulation
         
		Encap nj = new Encap();
		nj.setEmailid("hulml@gmail.com");
		
		
		System.out.println(nj.getEmailid());
		

	}

}
