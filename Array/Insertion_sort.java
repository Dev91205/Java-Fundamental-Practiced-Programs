package Array;

import java.util.Arrays;

public class Insertion_sort {
	public static void main(String[] args) {
		int[] arr= {343,221,5,252,2123,1,2,5312,121};
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
public static void InsertionSort(int [] arr) {
	for(int i=1;i<arr.length;i++) {
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
}
}
