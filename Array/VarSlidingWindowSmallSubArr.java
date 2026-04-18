package Array;

public class VarSlidingWindowSmallSubArr {

	    public static int smallest_sub_array(int[] arr, int sum) {
	        int n = arr.length;

	        int minsublength = n + 1;
	        int windowSum = 0;
	        int start = 0;

	        for (int end = 0; end < n; end++) {
	            windowSum += arr[end];

	            while (windowSum >= sum) {
	                int length = end - start + 1;
	                if (length < minsublength) {
	                    minsublength = length;
	                }
	                windowSum -= arr[start];
	                start++;
	            }
	        }

	      
	        return minsublength == n + 1 ? 0 : minsublength;
	    }
	}

