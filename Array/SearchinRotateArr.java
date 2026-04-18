package Array;

public class SearchinRotateArr {
public static void main(String[] args) {
	int[]arr= {2,3,5,6,8,10};
	int temp=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		arr[i+1]=arr[i];
	}
	arr[arr.length-1]=temp;
}
}
