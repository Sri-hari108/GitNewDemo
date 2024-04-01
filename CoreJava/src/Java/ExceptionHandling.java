package Java;

public class ExceptionHandling {
	
	int a=2;
	
	
	
	// try-catch mechanism- this is used avoid the 
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExceptionHandling ex= new ExceptionHandling();
		int b=4;
		int c=0;
		try
		{
			// purchased failed
//			int k=b/c;
//			System.out.println(k);
			
			int[] arr = new int[5];
			System.out.println(arr[8]);
		}
		/*
		catch(ArithmeticException ae) {
			System.out.println("Radha");
		}
		
		catch(IndexOutOfBoundsException ets) {
			System.out.println("Radha-VrindavanC");
		}
		 
		catch(Exception e){
			
			// retry payment
			System.out.println("OMK");
			
		}
		*/
		finally
		{
			System.out.println("Delete mind chattering");
			// this block will be executed irrespective of Exception thrown or not //
		}
		
		
	
	}

}
