package Array;

public class SumofAllELEin2D {
	public static void main(String[] args) {
		int sum=0;
		int[][] arr= {{1,2,3},{7,1,6},{2,3,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
