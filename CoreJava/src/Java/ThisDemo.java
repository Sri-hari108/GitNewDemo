package Java;

public class ThisDemo {
	
	  int a=9;   // global variable 
	//System.out.println(a);
	  
	 
	  
	public void getData() {
		
		int a=8;   // local variable
		int b = a + this.a;
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      ThisDemo td = new ThisDemo();
      td.getData();
      
      
      
      
	}

}
