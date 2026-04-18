package Array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {96,75,53,0,-100,22};
		bubble_sort(arr);
		System.out.println(Binary_Search(arr, 0));
	}
	public static int Binary_Search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1; 
			} else {
				start = mid + 1; 
			}
		}
		return -1;
	}
 public static void bubble_sort(int[] arr) {
	 int n=arr.length;
	 for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-1-i;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	 }
	 }
}
