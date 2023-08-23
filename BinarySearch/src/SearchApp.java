import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements for the array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the value you want to Search : ");
		Demo.search(arr,scan.nextInt());
		scan.close();
	}

}
