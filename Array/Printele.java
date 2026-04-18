package Array;

public class Printele {
	public static void printele(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void generateseq(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]*arr[i]);
		}
	}
 public static void main(String[] args) {
	int[]arr1=new int[5];
	arr1[0]=34;
	arr1[1]=12;
	arr1[2]=56;
	arr1[3]=14;
	arr1[4]=67;
	printele(arr1);
	generateseq(arr1);
}
}
