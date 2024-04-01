package Java;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. using algo 
		long num=123456;
		long rev=0;
		
		while(num !=0) {
			rev =rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse number:" +rev);
	

	
	// 2. Using StringBuffer Method
	long num1=123456;
	
	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	}
}
