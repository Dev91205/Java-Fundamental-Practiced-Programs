package Array;

public class CheckSym2DArray {
	public static void main(String[] args) {
	int arr[][]= {{1,2,3},{2,5,6},{3,6,9}};
	int trans[][]=new int[arr[0].length][arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			trans[j][i]=arr[i][j];
		}
	}
	boolean flag=false;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==trans[i][j]) {
				flag=true;
				
		}
			else {
				flag=false;
			}
	}
}
	if(flag) {
		System.out.println("It is Symetric");
	}
}	
}
