package Array;

import java.util.Scanner;

public class ReplacewithSum {
	    public static int digitSum(int n) {
	        int sum = 0;
	        while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            arr[i] = digitSum(arr[i]);
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}



