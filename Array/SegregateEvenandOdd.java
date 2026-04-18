package Array;

import java.util.Scanner;

public class SegregateEvenandOdd {

    public static void SegregateEvenOdd(int a[]) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {

            while (start < end && a[start] % 2 == 0) {
                start++;
            }

            while (start < end && a[end] % 2 != 0) {
                end--;
            }

            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SegregateEvenOdd(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
