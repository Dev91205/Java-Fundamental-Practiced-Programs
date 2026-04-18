package Array;

import java.util.Scanner;

public class CountSubarr {
	public static int CountSubArray(int []arr,int k,int x) {
	 int []res=new int[5];
	 int count=0;
	 for(int i=0;i<=arr.length-k;i++) {
		 int sum=0;
		 int avg=0;
		 for(int j=i;j<i+k;j++) {
			 sum+=arr[j];
			 }
		 avg=sum/k;
		 if(avg>=x) {
			 count++;
		 }
	 }
	 return count;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println(CountSubArray(arr, 3, 3));
	}

}
