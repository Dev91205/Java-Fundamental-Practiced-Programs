package Array;

import java.util.Scanner;

public class SumofSubArray {

    public static int[] SumofArraySub(int[] a, int k) {
        int n = a.length;

        if (k > n) {
            return new int[0]; 
        }

        int[] res = new int[n - k + 1];
        int windowSum = 0;

    
        for (int i = 0; i < k; i++) {
            windowSum += a[i];
        }
        res[0] = windowSum;

        for (int i = 1; i <= n - k; i++) {
            windowSum = windowSum - a[i - 1] + a[i + k - 1];
            res[i] = windowSum;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 3;
        int[] res = SumofArraySub(arr, k);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
