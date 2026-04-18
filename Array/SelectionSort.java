package Array;

import java.util.Arrays;

public class SelectionSort {
	 public static void selection_sort(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
			 int min_index=i;
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[j]<arr[min_index]) {
					 min_index=j;
				 }
			 }
			 int temp=arr[i];
			 arr[i]=arr[min_index];
			 arr[min_index]=temp;
		 }
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
	 public static void main(String[] args) {
		int[]arr= {12,33,543,23,53,2,31,234,23,1,2,32};
		selection_sort(arr);
		System.out.println(Binary_Search(arr,23));
	 }
}
