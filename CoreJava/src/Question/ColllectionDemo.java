package Question;

import java.util.ArrayList;

public class ColllectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,5,5,5,4,6,6,9,6};
		
		/*
		 * output :
		 * 4-2,5=4,6=3,9=1
		 * 
		 */
//		for(int i:a) {
//		System.out.print(i);
//		}
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
			int k=0;
			if (!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if (a[i]==a[j]) {
						k++;
					}
				}
			
				  System.out.println(a[i]); 
				  System.out.println(k); 
				  if(k==1) {
			      System.out.println(a[i]+"is unique number");
				  }
			}
		}

	}

}
