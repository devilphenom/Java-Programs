import java.util.Scanner;
public class NNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive Natural Number : ");
		int N = scan.nextInt();
		System.out.println(nSum(N));
		scan.close();
	}
	public static int nSum(int N) {
		int sum = 0;
		for (int i=1 ; i<=N;i++) {
			sum +=i;
		}
		return sum;
	}
}
