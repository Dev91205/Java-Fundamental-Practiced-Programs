package Array;

public class LinearSearch {
	public static void main(String[] args) {
		
 int [] arr = {1,5,23,5,32,6};
 int target=23;
 int count=0;
 for(int i=0;i<arr.length;i++) {
	 if(target==arr[i])
	 System.out.println(i);
 }
 for(int j=arr.length-1;j>0;j--) {
	 if(target==arr[j]) {
		 System.out.println(j);
	 }
 }
 for(int k=0;k<arr.length;k++) {
	 if(target==arr[k]) {
		 count++;
	 }
 }
 System.out.println(count);
 int temp=-1;
 for(int d=0;d<arr.length;d++) {
	 if(target==arr[d]) {
		 temp=d;
	 }
 }
 System.out.println(temp);
}
}
