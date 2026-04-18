package Array;

public class FirstOccurBS {
		public static int FirstOccur(int[] arr, int target) {
			int start = 0;
			int end = arr.length - 1;
			int temp=-1;
			
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (arr[mid] == target) {
					temp=mid;
					end=mid-1;
				} else if (arr[mid] > target) {
					end = mid - 1; 
				} else {
					start = mid + 1; 
				}
			}
		return temp;
		}

	public static void main(String[] args) {
		int[] arr = { 1,2,3,3,4,5}; 
		int t = 3;
		System.out.println(FirstOccur(arr, t));
	}
}
