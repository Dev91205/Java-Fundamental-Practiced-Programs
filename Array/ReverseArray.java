package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
	int i=0;
	int []arr1=new int[5];
	int j=arr1.length-1;
	arr1[0]=34;
	arr1[1]=12;
	arr1[2]=56;
	arr1[3]=14;
	arr1[4]=67;
	while(i<j) {
		int temp=arr1[i];
		arr1[i]=arr1[j];
		arr1[j]=temp;
		i++;
		j--;
	}
	for(int k=0;k<arr1.length;k++) {
		System.out.println(arr1[k]);
	}

	
}
}