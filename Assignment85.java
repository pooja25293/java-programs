package Javaassignments;

import java.util.Date;

//WAP to find out the current date, past date and future date using String function
public class Assignment85 {

	public static void main(String[] args) {

		Date d1 = new Date();
		// gettime return type is long
		// long l1 =d1.getTime();
		// this will return in enporch time
		System.out.println(d1.getTime());

		String Format = d1.toString();
		//DD-MMY-YYYY
		//DD/MMY/YYYY
		System.out.println(Format);
		
		String date = Format.substring(8, 10);;//(8,9)--it will actully print like this
		System.out.println(date);
		
		String Month = Format.substring(4, 7);
		System.out.println(Month);
		
		String Year = Format.substring(Format.length()-4);
		System.out.println(Year);
		
		String format2 =date.concat("-").concat(Month).concat("-").concat(Year);
			System.out.println(format2);	
			
			String format3 =date.concat("/").concat(Month).concat("/").concat(Year);
			System.out.println(format3);
		
			//future date using String function
			//1000 milisecond * 60 seconds *60 min * 24 hrs * 1 day
			//d1.gettime present date
			Date d2 = new Date(d1.getTime()+(1000*60*60*24*1));
			System.out.println(d2);
			
			
			//past date
			
			Date d3 = new Date(d1.getTime()-(1000*60*60*24*1));
			System.out.println(d3);
	}

}
