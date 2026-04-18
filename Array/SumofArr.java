package Array;

import java.util.Scanner;

public class SumofArr {
//  public static int[] SumofArray(int[]a,int index) {
//	  return new int{3,5,2,1};
//  }
  public static void main(String[] args) {
	  int n=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		int index=3;
		int[]arr=new int[n];
		int []s=new int[n-index+1];
	
		for(int i=0;i<n;i++) {
			arr[i]=i;
		}
		
		for(int i=0;i<arr.length;i++) {
			int wd=0;
			for(int j=i;j<=i+index;j++) {
				if(j<arr.length-1) {
					wd+=arr[j];
				}
			}
			System.out.println(wd);
			}
		}
		
	  

}


