package Question;

public class Swap2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1="Krishna";
		String name2="Radha";
		name1=name1+name2;
	
		System.out.println(name1);
		name2 =name1.substring(0, name1.length()-name2.length());
		name1=name1.substring(name2.length());
		System.out.println(name1);
		System.out.println(name2);
		
		
		// Take two string s1 and s2 which we need to swap.
		String s1 = "Rahul";
		String s2 = "Shetty";

		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1 + s2;

		// Use the substring method to get the subset of the combined string
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);

		

		

	}

}
