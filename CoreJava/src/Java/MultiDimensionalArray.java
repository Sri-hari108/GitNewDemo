package Java;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* find the minimum number
		 * 1 5 7
		 * 7 4 0
		 */
		int min =1233;
		int max=0;
		int array[][]={{1,5,7},{7,4,9}};
		int resultColumn=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(array[i][j]<min)
				{
					min=array[i][j];
					resultColumn=j;
				}
			}
		}
		for(int i=0;i<2;i++) {
		  if(max<array[i][resultColumn]) {
			  max=array[i][resultColumn];
		  }
		}
		 System.out.println(min);
		 System.out.println(resultColumn);		
		System.out.println(max);	
		
		/* find the maximum number
		 * 6 5 7
		 * 7 4 9
		 */
		
//		int a[][]= {{6,5,7},{7,4,9}};
//		int max=0;
//		
//		for (int i=0;i<2;i++) {
//			for(int j=0  ;j<3;j++) {
//				if(a[i][j]>max) {
//					max=a[i][j];
//				}
//			}
//		}
//		System.out.println(max);
	}

}
