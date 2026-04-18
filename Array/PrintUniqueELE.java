package Array;

public class PrintUniqueELE {
	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=2;
		arr[3]=3;
		arr[4]=1;
		for(int i=0;i<5;i++) {
			 int count=0;
			for(int j=0;j<5;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				}
				if(count==1) {
					System.out.println(arr[i]);
					break;
				}
				
			
		}
	}

}
