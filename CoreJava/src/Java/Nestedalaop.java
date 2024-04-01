package Java;

public class Nestedalaop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i=1;i<=4;i++) {
//			System.out.print("Outer loop start");
//			for(int j=1;j<=4;j++) {
//				System.out.print("Inner loop");
//			}
//			System.out.println("Outer loop end");
//		}
		/*
		 * 1234 
		 * 567
		 * 89
		 * 10
		 */
//		int k=1;
//		for (int i=1;i<=4;i++) {
//			
//			for(int j=i;j<=4;j++) {
//				System.out.print(k);
//				k++;
//			}
//			System.out.println(" ");
//		}
		
        /*
         * 1
         * 23
         * 456
         * 78910
         */
		int k=1;
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println(" ");
		}
	}

}
