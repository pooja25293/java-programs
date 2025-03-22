package Javaassignments;
// WAP on String Buffer using Append, insert, delete, substring, reverse, Capacity, replace

public class Assignment86 {

	public static void main(String[] args) {
		
		
		//mutable
		StringBuffer st = new StringBuffer("Pooja Datta  ");
		st.append("Sadafule");
		//System.out.println(st);
		
		//mutable
				StringBuilder str = new StringBuilder("Pooja Thdd lkjdoiaoi");
				str.append("Sadafule");
				//System.out.println(str);
		
				//System.out.println(st.insert(4, "loo"));
				
				//System.out.println(st.replace(4, 10, "Radha rani"));//(4-9)
				
				System.out.println(st.delete(0, 7));//(0-6)
				
				System.out.println(st.reverse());
				
				//capacity means storage
				int k = st.capacity();
				System.out.println(k);
				
	}

}
