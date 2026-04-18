package Array;

import java.util.Scanner;

public class CreateArray {
 public static void main(String[] args) {
	int n=0;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	
}
}
