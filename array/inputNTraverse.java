import java.util.Scanner;

public class inputNTraverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n no. of array element : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the no. to fetch , from the array : ");
		int ele = sc.nextInt();
		int j = size;
		while(j >= 0){
			if(j == ele){
				break;
		}
		j--;
		}
		System.out.println("The result is " + arr[j] );
		
	}
}