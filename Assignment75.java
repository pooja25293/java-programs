package Javaassignments;
//Find out the average of all the numbers presnet in your array
public class Assignment75 {

	public static void main(String[] args) {
		

		int rollno[] = new int[3];
		rollno[0] =  30;
		rollno[1] =  60;
		rollno[2] =  50;
		
		int sum = 0;
		double avg =0;
		
		for(int i=0; i<=2;i++) {
			sum = sum + rollno[i];
			
		}
			System.out.println(sum);
			avg = sum/rollno.length;
			System.out.println(avg);
		
		
	}

}
