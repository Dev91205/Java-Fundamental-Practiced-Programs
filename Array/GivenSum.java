package Array;

public class GivenSum {
public static void main(String[] args) {
	int []arr=new int[5];
	arr[0]=1;
	arr[1]=0;
	arr[3]=1;
	arr[4]=4;
	int sum=5;
	for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == sum) {
                System.out.println("Sum is present");
                return;
            }
        }
		
	}
	System.out.println("There is no sum");
	
}
}
