package Javaassignments;

public class Assignment87 {

	public static void main(String[] args) {
		// WAP on String Builder using Append, insert, delete, substring, reverse, Capacity, replace
				
				//mutable
				StringBuilder st = new StringBuilder("India is country ");
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
