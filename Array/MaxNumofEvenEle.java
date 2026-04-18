package Array;

import java.util.Scanner;

public class MaxNumofEvenEle {
	public static int CountSubArrayEvenEle(int []arr,int k) {
		 int maxcount=0;
		 for(int i=0;i<=arr.length-k;i++) {
			 int count=0;
			 for(int j=i;j<i+k;j++) {
				 if(arr[j]%2==0) {
					 count++;
				 }
			 }
			 if(count>maxcount) {
				 maxcount=count;
			 }
		 }
		 return maxcount;
}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println(CountSubArrayEvenEle(arr, 3));
	}
}