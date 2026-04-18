package Array;

public class NewPrac {

	    public static void main(String[] args) {

	        int[] arr = {2, 1, 2, 3, 4, 2, 1};
	        int k = 2;

	        int left = 0;
	        int evenCount = 0;
	        int maxLen = 0;

	        for (int right = 0; right < arr.length; right++) {

	            if (arr[right] % 2 == 0) {
	                evenCount++;
	            }

	            while (evenCount > k) {
	                if (arr[left] % 2 == 0) {
	                    evenCount--;
	                }
	                left++;
	            }

	            int currLen = right - left + 1;
	            if (currLen > maxLen) {
	                maxLen = currLen;
	            }
	        }

	        System.out.println(maxLen);
	    }
	}


