package Array;

public class BinarySearch {
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
		int[] arr = { 1, 2, 3, 4, 5, 24, 56 }; 
		int t = 24;
		System.out.println(Binary_Search(arr, t));
	}
}
