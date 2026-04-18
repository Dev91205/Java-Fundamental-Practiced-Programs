package Array;

public class Sumineachcol {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{7,1,6},{2,3,4}};
		int sum=0;
		int diasum=0;
		for(int j=0;j<arr[0].length;j++) {
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					diasum+=arr[i][j];
				}
			}
		}
		System.out.println(diasum);
	
	}


}
