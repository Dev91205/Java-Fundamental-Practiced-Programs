package Array;

import java.util.Scanner;

public class MaxSumSubArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int k = sc.nextInt();

	        int windowSum = 0;
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }

	        int maxSum = windowSum;

	        for (int i = k; i < n; i++) {
	            windowSum = windowSum - arr[i - k] + arr[i];
	            if (windowSum > maxSum) {
	                maxSum = windowSum;
	            }
	        }

	        System.out.println(maxSum);
	    }
	}


